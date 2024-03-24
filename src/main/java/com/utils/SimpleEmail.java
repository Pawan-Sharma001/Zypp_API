package com.utils;

import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.Session;

import org.apache.commons.mail.Email;

public class SimpleEmail {

	public static void main(String[] args) throws MessagingException {
System.out.println("SimpleEmail Start");
		
	    String smtpHostServer = "smtp.gmail.com";
	    String emailID = "pawan.sharma0702@gmail.com";
	    
	    Properties props = System.getProperties();

	    props.put("mail.smtp.host", smtpHostServer);

	    Session session = Session.getInstance(props, null);
	    
	    //Email.send(session, emailID, smtpHostServer);
	  //EmailUtil.sendEmail(session, emailID,"SimpleEmail Testing Subject", "SimpleEmail Testing Body");
	}

	}


