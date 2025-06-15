package shared;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import exceptions.EmailException;

public class Email {
	
	private final String emailAddress;
	private final String validator = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
	
	public Email(String emailAdress) throws EmailException {
		
		if (validateEmailAddress(emailAdress)) {
			this.emailAddress = emailAdress;
		}
		else {
			throw new EmailException("Invalid email.");
		}
	}
	
	private boolean validateEmailAddress(String address) {
		
		Pattern p = Pattern.compile(validator);
		Matcher m = p.matcher(address);
		
		if (m.matches()) {
			return true;
		}
		
		return false;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

}
