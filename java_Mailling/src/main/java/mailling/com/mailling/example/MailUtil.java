package mailling.com.mailling.example;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public class MailUtil {

	public static void main(String[] args) throws AddressException, MessagingException {
		MailClass mc1 = new MailClass();
		mc1.sendMail("abhimanyumoharana144@gmail.com");

	}
 
}
