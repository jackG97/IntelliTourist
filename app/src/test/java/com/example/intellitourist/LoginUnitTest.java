package com.example.intellitourist;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class LoginUnitTest {


    public Boolean getEmailValidator(String email1) {
        LoginActivity loginActivity = new LoginActivity();
        boolean usernameblank = email1.isEmpty();
        return usernameblank;
    }

    public Boolean getPasswordValidator(String password1) {
        LoginActivity loginActivity = new LoginActivity();
        boolean passwordblank = password1.isEmpty();
        return passwordblank;
    }

    public Boolean getUsernameValidator(String username1) {
        LoginActivity loginActivity = new LoginActivity();
        boolean usernameblank = username1.isEmpty();
        return usernameblank;
    }

    @Test
    public void onClick() {
        LoginActivity lactivity = new LoginActivity();
        assertFalse (lactivity.equals(""));
        {
            equals("Please provide a username");
            return;
        }
    }

    @Test
    public void EmailBlank() {
        LoginUnitTest activity = new LoginUnitTest();
        assertFalse(activity.getEmailValidator("Fields Empty"));
    }

    @Test
    public void PasswordBlank() {
        LoginUnitTest activity = new LoginUnitTest();
        assertFalse(activity.getPasswordValidator("Fields Empty"));
    }

    @Test
    public void UsernameBlank() {
        LoginUnitTest activity = new LoginUnitTest();
        assertFalse(activity.getUsernameValidator("Fields Empty"));
    }

    @Test
    public void EmailNotBlank() {
        LoginUnitTest activity = new LoginUnitTest();
        assertTrue(!activity.getEmailValidator("Jack@gmail.com"));
    }

    @Test
    public void PasswordNotBlank() {
        LoginUnitTest activity = new LoginUnitTest();
        assertTrue(!activity.getPasswordValidator("password234"));
    }

    @Test
    public void UsernameNotBlank() {
        LoginUnitTest activity = new LoginUnitTest();
        assertTrue(!activity.getUsernameValidator("user123"));
    }

}

