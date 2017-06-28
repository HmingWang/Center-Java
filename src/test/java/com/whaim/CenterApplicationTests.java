package com.whaim;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.BytesMessage;
import javax.jms.JMSException;
import javax.jms.TextMessage;

import static java.lang.Thread.sleep;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CenterApplicationTests {

    @Autowired
    private MessageQueueManager qmgr;

    @Autowired
    private ServiceDispatcherImpl mp;

	@Test
	public void testMain() {
	        //CenterApplication.main(null);
        String test="abcdefghijklmnopqrstuvwxyz";
        String b=test.substring(1,5);

        System.out.println(b);
	}

	@Test
	public void testMQMgr(){
		qmgr.init(mp);
		int count=10;
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
        qmgr.start();

        try{
            BytesMessage msg=qmgr.getSession().createBytesMessage();

            msg.writeBytes(new String("test message").getBytes());
            qmgr.sendMessage(msg);
            System.out.println(">>>>>>>>>>>>>>>>>send<<<<<<<<<<<<<<<");
        }catch(JMSException e){
            e.printStackTrace();
        }

        try {
            sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testMQMStart(){
        qmgr.init(mp);
        qmgr.start();
    }

}
