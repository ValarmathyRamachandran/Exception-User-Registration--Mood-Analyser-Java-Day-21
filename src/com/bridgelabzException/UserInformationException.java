package com.bridgelabzException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInformationException {

	public String regex;
	public boolean firstName(String firstName) {
			regex = "^[A-Z]{1}[a-z]{2,}$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(firstName);
			return matcher.matches();
	}
	
	public boolean testFirstName(String firstName) throws InvalidException {
        try {
            if (!firstName(firstName)) {
                throw new InvalidException("Your FirstName Entry is Invalid\n" +
                        "First name should start with Capital Letter and \n" +
                        "has atleast minimum 3 characters");
            } else {
                System.out.println("Your FirstName Entry is Valid");
            }
        } catch (InvalidException e) {
            System.out.println("Exception has Occurred" + e);
        }
        return firstName(firstName);
    }

	    public boolean lastName(String lastName) {
	        regex = "^[A-Z]{1}[a-z]{2,}$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(lastName);
			return matcher.matches();
	    }
	    
	    public boolean testLastName(String lastName) throws InvalidException {
	        try {
	            if (!lastName(lastName)) {
	                throw new InvalidException("Your LastName Entry is Invalid\n" +
	                        "Last name should start with Capital Letter and \n" +
	                        "has atleast minimum 3 characters");
	            } else {
	                System.out.println("Your LastName Entry is Valid");
	            }
	        } catch (InvalidException e) {
	            System.out.println("Exception has Occurred" + e);
	        }
	        return lastName(lastName);
	    }

	    public boolean emailId(String emailId) {
	        regex = "^[a-z0-9]+([_+-.][0-9a-z]+)*@[a-z]+.[a-z]{2,3}$";
	        Pattern pattern  = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(emailId);
			return matcher.matches();
	    }

	    public boolean testEmailId(String emailId) throws InvalidException {
	        try {
	            if (!emailId(emailId)) {
	                throw new InvalidException("Your Email Id Entry is Invalid");
	            } else {
	                System.out.println("Your Email Id Entry is Valid");
	            }
	        } catch (InvalidException e) {
	            System.out.println("Exception has Occurred" + e);
	        }
	        return emailId(emailId);
	    }
	    public boolean mobileNumber(String mobileNumber) {
	        regex = "^(\\d{1,3}[- ]?){1}\\d{9,10}$";
	        Pattern pattern  = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(mobileNumber);
			return matcher.matches();
	    }
	    
	    public boolean testMobileNumber(String mobileNumber) throws InvalidException {
	        try {
	            if (!mobileNumber(mobileNumber)) {
	                throw new InvalidException("Your MobileNumber Entry is Invalid\n" +
	                        "Mobile Number Should Contain Country Code");
	            } else {
	                System.out.println("Your MobileNumber Entry is Valid\n");
	            }
	        } catch (InvalidException e) {
	            System.out.println("Exception has Occurred" + e);
	        }
	        return mobileNumber(mobileNumber);
	    }

	    public boolean password(String password) {
	        regex = "^[a-z](?=.*[A-Z]+)(?=.*[0-9]+).{8,}$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(password);
			return matcher.matches();    
	    }
	    
	    public boolean testPassword(String password) throws InvalidException {
	        try {
	            if (!password(password)) {
	                throw new InvalidException("Your Password is Invalid\n" +
	                        "Password Must Contain at least\n" +
	                        "one Uppercase, one Numeric, one Special Character\n" +
	                        "and minimum 8 Characters ");
	            } else {
	                System.out.println("Your Password is Valid");
	            }
	        } catch (InvalidException e) {
	            System.out.println("Exception has Occurred" + e);
	        }
	        return password(password);
	    }
}
