package com.whaim;


import com.ibm.mq.jms.JMSC;
import com.ibm.mq.jms.MQConnectionFactory;
import org.aspectj.bridge.IMessageHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.jms.*;
import java.io.UnsupportedEncodingException;


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
    private MessageListener listener = null;

    // logger
    private static Logger logger = LoggerFactory.getLogger(MessageQueueManager.class);;

    void init(IMessageProcessor msgProcessor) {

        try {
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
            listener = new MessageListener() {
                @Override
                public void onMessage(Message message) {
                    recvMessageAsynHandler(message,msgProcessor);
                }
            };

            consumer_asyn.setMessageListener(listener);
            isInit=true;

            logger.info("MessageQueueManager init...");
        } catch (JMSException e) {
            e.printStackTrace();
        }

    }

    public void start(){
        try {
            if (!isInit) {
                logger.error("MessageQueueManager NOT init");
                throw new JMSException("MQ Manager NOT init");
            }

            connection.start();
            logger.info("MessageQueueManager start...");
        } catch (JMSException e) {
            e.printStackTrace();
        }

    }

    private void recvMessageAsynHandler(Message message,IMessageProcessor msgProcessor) {

        try {
            if (message instanceof BytesMessage) {
                BytesMessage bytesMessage = (BytesMessage) message;

                byte[] bytes = new byte[(int) bytesMessage.getBodyLength()];
                bytesMessage.readBytes(bytes);

                String msgString = new String(bytes, charset);

                logger.info("BytesMessage:" + msgString);
                //Interface IMessageProcessor method
                if(!msgProcessor.processMessage(msgString)){
                    throw new JMSException("user class method implement interface process message failed.");
                }

            } else {
                logger.warn("received UNKNOWN type message ...");
                logger.debug(message.toString());
            }

        } catch (JMSException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    Message recvMessage() {
        try {
            return consumer.receive();
        } catch (JMSException e) {
            e.printStackTrace();
            return null;
        }
    }

    void sendMessage(Message message) {
        try {
            producer.send(message);
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

    void sendMessage(String message) {
        try {
            producer.send(session.createTextMessage(message));
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

    private void dispose() {
        try {
            if (producer != null) producer.close();
            if (session != null) session.close();
            if (session_asyn != null) session_asyn.close();
            if (connection != null) connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
