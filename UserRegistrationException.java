package com.blz.regextest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class UserRegistrationException extends Exception {

    public static Object ExceptionType;
    public long type;

    public UserRegistrationException(String msg) {
        super(msg);
    }

    public void EMAIL_ID_REGEX(String emailIds) {
    }
}
