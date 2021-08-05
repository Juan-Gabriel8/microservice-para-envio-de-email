package com.microservice.email.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.email.model.EmailModel;
import com.microservice.email.repository.EmailRepository;

@Service
public class EmailService {
	
	@Autowired
	EmailRepository emailRepository;

	public void sendEmail(EmailModel emailModel) {
		
	}

}
