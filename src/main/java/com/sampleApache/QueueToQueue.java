package com.sampleApache;


import javax.jms.ConnectionFactory;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class QueueToQueue 
{

	public static void main( String[] args ) throws Exception
    {
    /*    ConnectionFactory factory = new ActiveMQConnectionFactory("admin", "admin", "tcp://localhost:61616");
        //Establish the connection
        javax.jms.Connection connection = factory.createConnection();
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        javax.jms.Queue queue = session.createQueue("sample");
        //Added as a producer
        javax.jms.MessageProducer producer = session.createProducer(queue);
        // Create and send the message
        TextMessage msg = session.createTextMessage();
        msg.setText("Hi Hellooooo");
        producer.send(msg);*/
		ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("spring-queue.xml");
        context.start();
        Thread.sleep(5000);;
        context.stop();
    }
}
