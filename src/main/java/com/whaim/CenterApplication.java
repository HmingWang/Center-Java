package com.whaim;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.jms.BytesMessage;

import static java.lang.Thread.sleep;

@SpringBootApplication
public class CenterApplication {

    private static Logger logger= LoggerFactory.getLogger(CenterApplication.class);

	@Bean
	public StartupRunner schedulerRunner() {
		return new StartupRunner();
	}

	public static void main(String[] args) {
		SpringApplication.run(CenterApplication.class);
		logger.info(">>>>>>>>Center Application Start<<<<<<<<");

	}


}
