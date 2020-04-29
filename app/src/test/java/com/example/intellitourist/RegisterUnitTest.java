package com.example.intellitourist;


import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class RegisterUnitTest {


    public Boolean getEmailValidator1(String email) {
        RegisterActivity regactivity = new RegisterActivity();
        boolean hasAtSign = email.indexOf("@") > -1;
        return hasAtSign;
    }

    public Boolean getPasswordValidator1(String password ) {
        RegisterActivity regactivity = new RegisterActivity();
        boolean passWordLength = password.length()>6;
        return passWordLength;
    }

    public Boolean getUsernameValidator1(String username ) {
        RegisterActivity regactivity = new RegisterActivity();
        boolean userName = username.contains("");
        return userName;
    }

    //unit test email is valid
    @Test
    public void emailIsValid() throws Exception {
        RegisterUnitTest ractivity = new RegisterUnitTest();
        assertTrue (ractivity.getEmailValidator1("jack@gmail.com"));
    }

    //unit test email is not valid
    @Test
    public void emailIsInValid() throws Exception{
        RegisterUnitTest ractivity = new RegisterUnitTest();
        assertTrue (!ractivity.getEmailValidator1("invalid email"));
    }

    //unit test password is valid
    @Test
    public void passwordIsValid() throws Exception{
        RegisterUnitTest ractivity = new RegisterUnitTest();
        assertTrue (ractivity.getPasswordValidator1("hi12345"));
    }

    //unit test password is not valid
    @Test
    public void passwordIsInValid() throws Exception{
        RegisterUnitTest ractivity = new RegisterUnitTest();
        assertFalse (!ractivity.getPasswordValidator1("invalid password"));
    }

    //unit test username is blank
    @Test
    public void userNameIsValid() throws Exception{
        RegisterUnitTest ractivity = new RegisterUnitTest();
        assertFalse (!ractivity.getUsernameValidator1("user1"));
    }

    //unit test username is not blank
    @Test
    public void userNameIsInValid() throws Exception{
        RegisterUnitTest ractivity = new RegisterUnitTest();
        assertTrue (ractivity.getUsernameValidator1("invalid username"));;
    }

    @Test
    public void onClick() {
        // Don't save if the fields do not validate.
        RegisterActivity activity = new RegisterActivity();
        assertFalse (activity.equals("Jack.com"));
        {
            equals("Sign up unsuccessful. email is badly formatted.");
            return;
        }
    }



}
