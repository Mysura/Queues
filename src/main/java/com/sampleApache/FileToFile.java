package com.sampleApache;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FileToFile {
	
	public static void main(String [] s) throws Exception{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-FToF.xml");
		context.start();
		Thread.sleep(5000);
		context.stop();
	}

}
