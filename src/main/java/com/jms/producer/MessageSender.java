package com.jms.producer;
//package com.jms.sender;
//
//import javax.jms.Connection;
//import javax.jms.Destination;
//import javax.jms.JMSException;
//import javax.jms.MessageProducer;
//import javax.jms.Session;
//import javax.jms.TextMessage;
//
//import org.apache.activemq.ActiveMQConnection;
//import org.apache.activemq.ActiveMQConnectionFactory;
//
//public class MessageSender {
//
//	private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;
//	private static String queueName = "QUEUE_NAME";
//
//	public static void main(String[] args) {
//
//		ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(url);
//		activeMQConnectionFactory.setTrustAllPackages(true);
//		try (Connection connection = activeMQConnectionFactory.createConnection();
//				Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);) {
//			connection.start();
//			Destination destination = session.createQueue(queueName);
//			MessageProducer producer = session.createProducer(destination);
//			TextMessage message = session.createTextMessage("Hello Amod, how are you ?");
//			producer.send(message);
//		} catch (JMSException e) {
//			e.printStackTrace();
//		}
//		System.out.println("Message sent successfully !!");
//	}
//
//}
