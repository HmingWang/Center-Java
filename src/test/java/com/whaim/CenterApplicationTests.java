package com.whaim;

import com.whaim.datagram.DataParser;
import com.whaim.mq.MessageQueueManager;
import com.whaim.mq.ServiceDispatcher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import szfs.std.szfs._2010.tech.xsd.szfs_301_002.Document;

import javax.jms.BytesMessage;
import javax.jms.JMSException;
import javax.jms.TextMessage;

import java.io.File;
import java.io.FileInputStream;

import static java.lang.Thread.sleep;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CenterApplicationTests {

    @Autowired
    private MessageQueueManager qmgr;

    @Autowired
    private ServiceDispatcher mp;

    @Autowired
    private DataParser<Document> dp;

    private byte[] msgs;

	@Test
	public void testMain() throws Exception {

        File f=new File("z:\\git\\Center-java\\src\\main\\resources\\xml\\301.xml");
        FileInputStream fs=new FileInputStream(f);
        msgs=new byte[(int) f.length()];

        fs.read(msgs);

        testSendMessage();

        System.out.println(dp.toString());

        try {
            sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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

            msg.writeBytes(msgs);
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
