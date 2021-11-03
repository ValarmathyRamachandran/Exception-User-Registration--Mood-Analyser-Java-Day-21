package com.bridgelabzException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UserInformationExceptionTest {

	UserInformationException exceptionUserRegistration = new UserInformationException();

	    @Test
	    public void firstName() throws InvalidException {
	        String firstName = "Valarmathy";
	        Assert.assertTrue(exceptionUserRegistration.testFirstName(firstName));
	    }

	    @Test
	    public void lastName() throws InvalidException {
	        String lastName = "Ramachandran";
	        Assert.assertTrue(exceptionUserRegistration.testLastName(lastName));
	    }

	    @Test
	    public void emailId() throws InvalidException {
	        String emailId = "valarmathi.95@gmail.com";
	        Assert.assertTrue(exceptionUserRegistration.testEmailId(emailId));
	    }

	    @Test
	    public void mobileNumber() throws InvalidException {
	        String mobileNumber = "91 9876543210";
	        Assert.assertTrue(exceptionUserRegistration.testMobileNumber(mobileNumber));
	    }

	    @Test
	    public void password() throws InvalidException{
	        String password = "bridgeL#30";
	        Assert.assertTrue(exceptionUserRegistration.testPassword(password));
	    }
	}
