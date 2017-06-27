package com.whaim;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.JMSException;
import javax.jms.TextMessage;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CenterApplicationTests {

    @Autowired
    private MessageQueueManager qmgr;

    @Autowired
    private MessageParser mp;

	@Test
	public void testMain() {
	        //CenterApplication.main(null);
	}

	@Test
	public void testMQMgr(){
		qmgr.init(mp);
		int count=1000;
		while(count-->0){
		    qmgr.sendMessage(Integer.toString(count));
        }
	}

	@Test
    public void testRecvMessage(){
	    qmgr.init(mp);
        String msg= null;
        try {
            msg = ((TextMessage) qmgr.recvMessage()).getText();
        } catch (JMSException e) {
            e.printStackTrace();
        }
        System.out.println("RECV>>>>>"+msg);
    }

    @Test
    public void testSendMessage(){
        qmgr.init(mp);
        try{
            TextMessage msg=qmgr.getSession().createTextMessage();
            msg.setText("test message");
            qmgr.sendMessage(msg);
            System.out.println(">>>>>>>>>>>>>>>>>send<<<<<<<<<<<<<<<");
        }catch(JMSException e){
            e.printStackTrace();
        }
    }

    @Test
    public void testMQMStart(){
        qmgr.init(mp);
        qmgr.start();
    }

}
