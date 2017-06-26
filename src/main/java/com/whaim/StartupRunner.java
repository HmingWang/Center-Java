package com.whaim;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

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

            mqt.setDaemon(true);
            mqt.run();
    }
}
