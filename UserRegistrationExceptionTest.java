package com.blz;

import com.blz.regextest.UserRegistration;
import com.blz.regextest.UserRegistrationException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class UserRegistrationExceptionTest {
    private UserRegistration user;

    @Before
    public void UserRegistrationObj() {
        user = new UserRegistration();
    }

    @Test
    public void testFirstName_thenAssertionSucceeds() {
        try {
            assertTrue(user.isValidateFirstName("Tejas"));
            System.out.println("Valid First Name");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testFirstName_thenAssertionFail() {
        try {
            assertTrue(user.isValidateFirstName("cristiano"));
            System.out.println("Valid First Name");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testLastName_thenAssertionSucceeds() {
        try {
            assertTrue(user.isValidateLastName("Dandge"));
            System.out.println("Valid Last Name");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testLastName_thenAssertionFail() {
        try {
            assertTrue(user.isValidateLastName("cr7"));
            System.out.println("Valid Last Name");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testEmail_thenAssertionSucceeds() {
        try {
            assertTrue(user.isValidateEmail("abc@gmail.com"));
            System.out.println("Valid Email");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testEmail_thenAssertionFail() {
        try {
            assertTrue(user.isValidateEmail("abc@gmail@.com@"));
            System.out.println("Valid Email");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }
    @After
    public void nullObj() {
        user = null;
    }
}


