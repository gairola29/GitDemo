package Staging.com.cybex.util;

import java.util.Properties;
import java.lang.*;
import java.io.File;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import com.sun.mail.util.*;


@SuppressWarnings("unused")
public class Sendmail {

	 public void sendmailreport()
	 {
		 
		 final String username = "testuserreport@gmail.com";
	       final String password = "Changeme@123";

	       Properties prop = new Properties();
	       
	       
	       prop.put("mail.smtp.host", "smtp.googlemail.com");
	       prop.put("mail.smtp.port", "465");
	       prop.put("mail.smtp.auth", "true");
	       //prop.put("mail.debug","false");
	       prop.put("protocol","smtp");
	       
	       prop.put("mail.smtp.socketFactory.port", "465");
	       prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	       //prop.put("mail.setTLS", "true");
	       
	       
	       Session session = Session.getInstance(prop,
	               new javax.mail.Authenticator() {
	                   protected PasswordAuthentication getPasswordAuthentication() {
	                       return new PasswordAuthentication(username, password);
	                   }
	               });

	       try {

	           Message message = new MimeMessage(session);
	           message.setFrom(new InternetAddress("testuserreport@gmail.com"));
	           message.setRecipients(
	                   Message.RecipientType.TO,
	                   InternetAddress.parse("ashishg@umbrellainfocare.com")
	           );
	           message.setSubject("Automation test suite report");
	          
	           BodyPart messageBodyPart1 = new MimeBodyPart();
	           messageBodyPart1.setText("Dear Sir,"
	                  + "\n\n Please find attached automation test report, to view report please download report and open in chrome browser");
	           MimeBodyPart messageBodyPart2 = new MimeBodyPart();
	          String filename = "C:/Users/UIPL/eclipse-workspace/UAT/test-output/Report/Extent/Extent.html";
	         //  String filename="user.dir" +"/test-output/Report/Extent/
	         DataSource source = new FileDataSource(filename);
	           messageBodyPart2.setDataHandler(new DataHandler(source));
	           messageBodyPart2.setFileName(filename);
	           Multipart multipart = new MimeMultipart();
	           multipart.addBodyPart(messageBodyPart2);
	           multipart.addBodyPart(messageBodyPart1);
	           message.setContent(multipart);
	           Transport.send(message);

	           System.out.println("/////////////////Mail send/////////////////");

	       } catch (MessagingException e) {
	           e.printStackTrace();
	       }

	}
}
	 
	
