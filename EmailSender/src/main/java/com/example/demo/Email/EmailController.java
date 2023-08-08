package com.example.demo.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

	

	    @Autowired
	    private EmailService emailService;

	    @GetMapping("/sendemail")
	    public String sendEmail() {
	        emailService.sendSimpleEmail("divyashreesenthilkumar@gmail.com", "Welcome", "This is a test email.");
	       return "Email sent!";
	       
	       
	    }
	}