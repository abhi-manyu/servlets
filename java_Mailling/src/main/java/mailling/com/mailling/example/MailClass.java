package mailling.com.mailling.example;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailClass
{
    public void sendMail(String rcvr) throws AddressException, MessagingException
    {
    	System.out.println("preparing ur mail");
    	
    	Properties prop = new Properties();
    	
    	prop.put("mail.smtp.auth", "true");
    	prop.put("mail.smtp.starttls.enable","true");
        prop.put("mail.smtp.host","smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        
        
        final String myAccountEmail="abhim.moharana@gmail.com";
        //final String password = "abhi@manyu@12345";
        
        Session s = Session.getInstance(prop, new Authenticator() {
        	@Override
        	protected PasswordAuthentication getPasswordAuthentication() {
        		return new PasswordAuthentication(myAccountEmail, "cezrznurjetflwdp"); 
        	}
		});
        	
       Message msg = prepareMessage(s,myAccountEmail,rcvr);
       
       Transport.send(msg);
       
       System.out.println("mail sent successfully");
    }

	private static Message prepareMessage(Session s,String myAccountEmail,String rcvr) throws AddressException, MessagingException
	{
		Message msg = new MimeMessage(s);
		msg.setRecipient(Message.RecipientType.TO, new InternetAddress(rcvr));
		msg.setSubject("this is a testing message");
		msg.setText("hello there , how are you ? thank you for registering in messenger application \n\n"
				+ "thanks and regards \n"
				+ "team messenger :)");
		
		msg.setFrom(new InternetAddress(myAccountEmail));
		return msg;
	}
    
}
