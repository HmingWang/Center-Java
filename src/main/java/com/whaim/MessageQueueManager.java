package com.whaim;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import com.ibm.mq.jms.MQConnectionFactory;
import com.ibm.mq.jms.JMSC;
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

    private int port;
    private String host;
    private String qmgr;
    private String channel;
    private String username;
    private String password;
    private String sendq;
    private String recvq;
    private int ccsid;

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
    private Logger logger=null;

    void init(){
        logger=LoggerFactory.getLogger(MessageQueueManager.class);

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
            connection = factory.createConnection(username,password);
            //connection = factory.createConnection();
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            session_asyn = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            producer = session.createProducer(session.createQueue(sendq));
            consumer = session.createConsumer(session.createQueue(recvq));
            consumer_asyn=session_asyn.createConsumer(session_asyn.createQueue(recvq));

            // Set Listener
            listener=new MessageListener() {
                @Override
                public void onMessage(Message message) {
                    recvMessageAsynHandler(message);
                }
            };

            consumer_asyn.setMessageListener(listener);

            // Start the connection
            connection.start();


        } catch (JMSException jmsex) {
            jmsex.printStackTrace();
        }

    }

    private void recvMessageAsynHandler(Message message) {
        if(message instanceof TextMessage){
            TextMessage textMessage=(TextMessage)message;
            try {
                logger.info(textMessage.getText());
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
        else{
            logger.warn("NOT TextMessage type message :"+message.toString().substring(0,10)+"...");
            return;
        }


    }

    Message recvMessage() {
        try{
            return consumer.receive();
        }catch(JMSException e){
            e.printStackTrace();
            return null;
        }
    }

    void sendMessage(Message message) {
        try{
            producer.send(message);
        }catch(JMSException e){
            e.printStackTrace();
        }
    }

    void sendMessage(String message) {
        try{
            producer.send(session.createTextMessage(message));
        }catch(JMSException e){
            e.printStackTrace();
        }
    }

    private void dispose() {
        try {
            if(producer!=null) producer.close();
            if(session !=null) session.close();
            if(session_asyn !=null) session_asyn.close();
            if(connection!=null) connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
