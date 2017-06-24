package com.whaim;

import com.ibm.mq.jms.MQConnectionFactory;
import org.springframework.stereotype.Component;
import com.ibm.mq.jms.JMSC;
import javax.jms.*;


/**
 * Created by 王海明 on 2017/6/24.
 */

@Component
public class MessageQueueManager {


    // Variables
    private Connection connection = null;
    private Session session = null;
    private Destination destination = null;
    private MessageProducer producer = null;

    void init(){

        System.out.println(System.getProperty("java.classpath"));
        try {
            // Create a connection factory
            // objects
            MQConnectionFactory factory = new MQConnectionFactory();
            factory.setQueueManager("QM000");
            factory.setHostName("localhost");
            factory.setPort(1414);
            factory.setChannel("SVRCONN");
            factory.setTransportType(JMSC.MQJMS_TP_CLIENT_MQ_TCPIP);

            // Create JMS objects
            connection = factory.createConnection();
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            destination = session.createQueue("000_1");
            producer = session.createProducer(destination);

            long uniqueNumber = System.currentTimeMillis() % 1000;
            TextMessage message = session
                    .createTextMessage("JmsProducer: Your lucky number today is " + uniqueNumber);

            // Start the connection
            connection.start();

            // And, send the message
            producer.send(message);
            System.out.println("Sent message:\n" + message);

        } catch (JMSException jmsex) {
            jmsex.printStackTrace();
        }

    }
}
