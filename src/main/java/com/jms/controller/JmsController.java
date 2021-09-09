package com.jms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jms.model.Customer;
import com.jms.model.MessageStorage;
import com.jms.producer.JmsProducer;

@RestController
public class JmsController {

	@Autowired
	private JmsProducer jmsProducer;

	@Autowired
	private MessageStorage messageStorage;

	@PostMapping(value = "/api/customer")
	public Customer postCustomer(@RequestBody Customer customer) {
		jmsProducer.send(customer);
		return customer;
	}

	@GetMapping(value = "/api/customers")
	public List<Customer> getAll() {
		List<Customer> customers = messageStorage.getAll();
		return customers;
	}

	@DeleteMapping(value = "/api/customers/clear")
	public String clearCustomerStorage() {
		messageStorage.clear();
		return "Clear All CustomerStorage!";
	}
}
