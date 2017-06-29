package com.whaim;

import com.whaim.mq.MessageQueueThread;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

/**
 * Created by whaim on 2017/6/26.
 */
public class StartupRunner implements CommandLineRunner {

    @Autowired
    private MessageQueueThread mqt;

    @Override
    public void run(String... strings) throws Exception {
        Logger logger= LoggerFactory.getLogger(StartupRunner.class);
        logger.info(">>>>>>>>>>Startup Runner<<<<<<<<<<<");

        //set daemon thread
        mqt.setDaemon(true);
        mqt.run();
    }
}
