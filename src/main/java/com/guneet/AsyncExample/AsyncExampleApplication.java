package com.guneet.AsyncExample;

import java.util.concurrent.Executor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@SpringBootApplication
@EnableAsync
public class AsyncExampleApplication{

	public static void main(String[] args) {
		SpringApplication.run(AsyncExampleApplication.class, args);
	}

	@Bean
	public Executor asyncExecutor(){
		ThreadPoolTaskExecutor executor  =new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(2);
		executor.setMaxPoolSize(2);
		executor.setQueueCapacity(500);
		executor.setThreadNamePrefix("Guneet-");
		executor.initialize();
		return executor;
	}

}
