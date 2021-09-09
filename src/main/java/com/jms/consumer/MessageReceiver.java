package com.jms.consumer;
//package com.jms.receiver;
//
//import javax.jms.Connection;
//import javax.jms.Destination;
//import javax.jms.JMSException;
//import javax.jms.Message;
//import javax.jms.MessageConsumer;
//import javax.jms.Session;
//import javax.jms.TextMessage;
//
//import org.apache.activemq.ActiveMQConnection;
//import org.apache.activemq.ActiveMQConnectionFactory;
//
//public class MessageReceiver {
//
//	private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;
//	private static String queueName = "QUEUE_NAME";
//
//	public static void main(String[] args) {
//
//		ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(url);
//		activeMQConnectionFactory.setTrustAllPackages(true);
//		try (Connection connection = activeMQConnectionFactory.createConnection()) {
//			connection.start();
//			Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
//			Destination destination = session.createQueue(queueName);
//			MessageConsumer consumer = session.createConsumer(destination);
//			Message message = consumer.receive();
//			if (message instanceof TextMessage) {
//				TextMessage textMessage = (TextMessage) message;
//				System.out.println(textMessage.getText());
//			}
//		} catch (JMSException e) {
//			e.printStackTrace();
//		}
//
//	}
//
//}
