package com.whaim;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.jms.BytesMessage;

@SpringBootApplication
public class CenterApplication implements CommandLineRunner{

    private static Logger logger= LoggerFactory.getLogger(CenterApplication.class);

    @Autowired
    private MessageQueueManager mqm;

	public static void main(String[] args) {
		SpringApplication.run(CenterApplication.class);
	}

    @Override
    public void run(String... strings) throws Exception {

        logger.info("=====================center service started=========================");

        mqm.init();

        boolean bLoop=true;
        while(bLoop){

        }
    }
}
