package com.jms.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.jms.model.Customer;

@Component
public class JmsProducer {

	@Autowired
	private JmsTemplate jmsTemplate;

	@Value("${spring.activemq.queue}")
	String queue;

	public void send(Customer customer) {
		jmsTemplate.convertAndSend(queue, customer);
	}

}
