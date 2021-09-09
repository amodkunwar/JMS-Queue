package com.jms.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.jms.model.Customer;
import com.jms.model.MessageStorage;

@Component
public class JmsConsumer {

	@Autowired
	private MessageStorage messageStorage;

	@JmsListener(destination = "${spring.activemq.queue}", containerFactory = "jsaFactory")
	public void receive(Customer customer) {
		System.out.println("Message receiver " + customer);
		messageStorage.add(customer);
	}

}
