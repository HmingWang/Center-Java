package com.whaim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.jms.BytesMessage;

@SpringBootApplication
public class CenterApplication implements CommandLineRunner{

    @Autowired
    private MessageQueueManager mqm;

	public static void main(String[] args) {
		SpringApplication.run(CenterApplication.class);
	}

    @Override
    public void run(String... strings) throws Exception {
        mqm.init();

    }
}
