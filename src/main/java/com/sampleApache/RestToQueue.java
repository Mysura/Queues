package com.sampleApache;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RestToQueue {
	
	public static void main(String []s) throws Exception{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-QueueToRest.xml");
		context.start();
		//context.stop();
	}
	

}
