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

	@Test
	public void testMain() {
	        CenterApplication.main(null);
	}

	@Test
	public void testMQMgr(){
		qmgr.init();
		int count=1;
		while(true){
		    qmgr.sendMessage(Integer.toString(count++));
        }
	}

	@Test
    public void testRecvMessage(){
	    qmgr.init();
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
        qmgr.init();
        try{
            TextMessage msg=qmgr.getSession().createTextMessage();
            msg.setText("今天没戏唱");
            qmgr.sendMessage(msg);
            System.out.println(">>>>>>>>>>>>>>>>>send<<<<<<<<<<<<<<<");
        }catch(JMSException e){
            e.printStackTrace();
        }
    }

}
