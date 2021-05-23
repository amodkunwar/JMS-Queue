package com.jms.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

	@JmsListener(destination = "MESSAGE_QUEUE")
	public void messageListener(String systemMessage) {
		System.out.println("Message Recieved : " + systemMessage);
	}

}
