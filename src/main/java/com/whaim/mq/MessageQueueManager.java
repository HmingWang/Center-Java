package com.whaim.mq;


import com.ibm.mq.jms.JMSC;
import com.ibm.mq.jms.MQConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.jms.*;


/**
 * Created by whaim on 2017/6/24.
 */

@Component
@ConfigurationProperties(prefix = "mq")
public class MessageQueueManager {

    public void setPort(int port) {
        this.port = port;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setQmgr(String qmgr) {
        this.qmgr = qmgr;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSendq(String sendq) {
        this.sendq = sendq;
    }

    public void setRecvq(String recvq) {
        this.recvq = recvq;
    }

    public void setCcsid(int ccsid) {
        this.ccsid = ccsid;
    }

    public Session getSession() {
        return session;
    }

    public Session getSession_asyn() {
        return session_asyn;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    private int port;
    private String host;
    private String qmgr;
    private String channel;
    private String username;
    private String password;
    private String sendq;
    private String recvq;
    private int ccsid;
    private String charset;

    private boolean isInit=false;

    // Variables
    private Connection connection = null;

    // synchro session for synchro read and write
    private Session session = null;

    // asynchro session for asynchro read
    private Session session_asyn = null;

    private MessageProducer producer = null;
    private MessageConsumer consumer = null;
    private MessageConsumer consumer_asyn = null;
    private IDispatcher dispatcher=null;

    // logger
    private static Logger logger = LoggerFactory.getLogger(MessageQueueManager.class);;

    public void init(IDispatcher dsp) throws JMSException {


        // Create a connection factory objects
        MQConnectionFactory factory = new MQConnectionFactory();
        factory.setQueueManager(qmgr);
        factory.setHostName(host);
        factory.setPort(port);
        //factory.setChannel(channel);
        factory.setTransportType(JMSC.MQJMS_TP_CLIENT_MQ_TCPIP);
        factory.setCCSID(ccsid);

        // Create JMS objects
        connection = factory.createConnection(username, password);
        //connection = factory.createConnection();
        session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        session_asyn = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

        producer = session.createProducer(session.createQueue(sendq));
        consumer = session.createConsumer(session.createQueue(recvq));
        consumer_asyn = session_asyn.createConsumer(session_asyn.createQueue(recvq));

        // Set Listener
        consumer_asyn.setMessageListener(new MessageListener() {
            @Override
            public void onMessage(Message message) {
                try {
                    recvMessageAsynHandler(message);
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
        });

        dispatcher=dsp;
        isInit=true;

        logger.info("MessageQueueManager init...");

    }

    //Asyn Method Use
    public void start() throws JMSException {

        if (!isInit) {
            logger.error("MessageQueueManager NOT init");
            throw new JMSException("MQ Manager NOT init");
        }

        connection.start();
        logger.info("MessageQueueManager start...");


    }

    private void recvMessageAsynHandler(Message message) throws JMSException {

        if (message instanceof BytesMessage) {
            BytesMessage bytesMessage = (BytesMessage) message;

            byte[] bytes = new byte[(int) bytesMessage.getBodyLength()];
            bytesMessage.readBytes(bytes);

            logger.info("received message================" );
            //Interface IMessageProcessor method
            if(!dispatcher.dispatch(bytes)){
                logger.error("user class method implement interface dispatch message failed.");
            }

        } else {
            logger.warn("received UNKNOWN type message ...");
            logger.debug(message.toString());
        }

    }

    public Message recvMessage() throws JMSException {
        return consumer.receive();
    }

    public void sendMessage(Message message) throws JMSException {
        producer.send(message);
    }

    public void sendMessage(String message) throws JMSException {
        producer.send(session.createTextMessage(message));
    }

    private void dispose() throws JMSException {
        if (producer != null) producer.close();
        if (session != null) session.close();
        if (session_asyn != null) session_asyn.close();
        if (connection != null) connection.close();

    }


}
