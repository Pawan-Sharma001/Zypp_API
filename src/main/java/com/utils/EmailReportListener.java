package com.utils;

import org.testng.*;
import org.testng.annotations.*;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

public class EmailReportListener implements ITestListener {
	
	@Override
    public  void onFinish(ITestContext context) {
        sendEmail(createTestNGReport(context));
    }

   public String createTestNGReport(ITestContext context) {
        StringBuilder report = new StringBuilder();
        report.append("Test Suite Name: ").append(context.getName()).append("\n");
        report.append("Total Tests: ").append(context.getAllTestMethods().length).append("\n");
        report.append("Passed Tests: ").append(context.getPassedTests().getAllResults().size()).append("\n");
        report.append("Failed Tests: ").append(context.getFailedTests().getAllResults().size()).append("\n");
        // Add more details as needed

        return report.toString();
    }

    public void sendEmail(String content) {
        // Email configuration
        String host = "74.125.133.109";// your_smtp_host smtp.gmail.com 
        String port = "465";
        String senderEmail = "pawan.sharma0702@gmail.com";
        String senderPassword = "momdadlovesyou@123";
        String recipientEmail = "sharma14714@gmail.com";
        
        // Email properties
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);

        // Create session
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        try {
            // Create message
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipientEmail));
            message.setSubject("TestNG Report");
            message.setText(content);

            // Send message
            Transport.send(message);
            System.out.println("TestNG report sent successfully.");
        } catch (MessagingException e) {
            System.out.println("Error sending TestNG report: " + e.getMessage());
        }
    }

    // Other overridden methods from ITestListener (not shown here)
}


