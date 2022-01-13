package com.blz.regextest;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean isValidateFirstName(String firstName) throws UserRegistrationException {
        if (!validateRegex(firstName, RegexConstants.FIRST_NAME_REGEX))
            throw new UserRegistrationException("Invalid First name");
        return true;
    }

    public boolean isValidateLastName(String lastName) throws UserRegistrationException {
        if (!validateRegex(lastName, RegexConstants.LAST_NAME_REGEX))
            throw new UserRegistrationException("Invalid Last name");
        return true;
    }

    public boolean isValidateEmail(String email) throws UserRegistrationException {
        if (!validateRegex(email, RegexConstants.EMAIL_ID_REGEX))
            throw new UserRegistrationException("Invalid Email Id");
        return true;
    }


    private boolean validateRegex(String request, String pattern) {
        return Pattern.compile(pattern).matcher(request).matches() ? true : false;
    }
}


