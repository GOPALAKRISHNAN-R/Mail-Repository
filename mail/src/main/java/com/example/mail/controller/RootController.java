package com.example.mail.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class RootController {

	
	@Autowired
	private SmtpMailSender smtpMailSender;

	@RequestMapping("/send-mail")
	public void sendMail() throws MessagingException {
		
		smtpMailSender.send("harikrishnan555.hk@gmail.com", "Test mail from My app", "Bablu");
		
	}

}
