package mailling.com.mailling.example;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public class MailUtil {

	public static void main(String[] args) throws AddressException, MessagingException {
		MailClass.sendMail("ghoshsaptarshiaot@gmail.com");

	}
 
}
