package com.jms.controller;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublishController {

	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Autowired
	private Queue queue;
	
	@PostMapping("/publish/{message}")
	public String publish(@PathVariable("message") String message) {
		jmsTemplate.convertAndSend(queue, message);
		return "Message published successfully";
	}
	
}
