package com.utils;



import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Email {
		private static String host = "74.125.133.109";
	    private static String to = "sharma14714@gmail.com";
		private static String from = "pawan.sharma@gmail.com";
		private static String cc = "pawan.sharma@zypp.app";
	    private static String bcc = "pawan.sharma@zypp.app";
		
		public static void send(String from, String to, String subject, String contents) throws MessagingException {		
			Properties prop = System.getProperties();
			prop.setProperty("mail.smtp.host", host);
			
			Session session = Session.getDefaultInstance(prop);
			
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.setSubject(subject);
			message.setContent(contents, "text/html");

			List <String>toList = getAddress(to);
			for (String address : toList) {
				message.addRecipient(Message.RecipientType.TO, new InternetAddress(address));
			}
			
			List<String> ccList = getAddress(cc);
			for (String address : ccList) {
				message.addRecipient(Message.RecipientType.CC, new InternetAddress(address));
			}
			
			List<String> bccList = getAddress(bcc);
			for (String address : bccList) {
				message.addRecipient(Message.RecipientType.BCC, new InternetAddress(address));
			}
			
			Transport.send(message);
		}
		
		public static void send(String to, String subject, String contents) throws MessagingException {
			send(from, to, subject, contents);
		}
		
		public static void send(String subject, String contents) throws MessagingException {
			send(from, to, subject, contents);
		}
		
		private static List getAddress(String address) {
			List addressList = new ArrayList();
			
			if (address.isEmpty())
				return addressList;
			
			if (address.indexOf(";") > 0) {
				String[] addresses = address.split(";");
				
				for (String a : addresses) {
					addressList.add(a);
				}
			} else {
				addressList.add(address);
			}
			
			return addressList;
		}

	}

	// usage Email.send("me@host.com", "recip1@host.com;recip2@host.com", "New Subject", "<h1>header</h2>")


