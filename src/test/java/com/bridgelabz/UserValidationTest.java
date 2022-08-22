package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidationTest {
    @Test
    public void happyFirstName() {
        try {
            Assertions.assertTrue(UserValidation.validFirstName("Ani"));
            System.out.println("FirstName is Valid \n");
        } catch (InvalidNameException e) {
            System.out.println("A problem occurred: " + e);
        }
    }
    @Test
    public void sadFirstName(){
       try {
           Assertions.assertFalse(UserValidation.validFirstName("anirban Roy"));
           System.out.println("FirstName is Invalid \n");
       } catch (InvalidNameException e) {
        System.out.println("A problem occurred: " + e);
    }
}

    @Test
    public void happyLastName() {
        try {
            Assertions.assertTrue(UserValidation.validLastName("Roy"));
            System.out.println("LastName is Valid \n");
        } catch (InvalidNameException e) {
            System.out.println("A problem occurred: " + e);
        }
    }

    @Test
    public void sadLastName() {
        try{
            Assertions.assertFalse(UserValidation.validLastName("anirban Roy"));
            System.out.println("LastName is Invalid \n");
        } catch (InvalidNameException e) {
            System.out.println("A problem occurred: " + e);
        }
    }
    @Test
    public void happyEmail() {
        try{
            Assertions.assertTrue(UserValidation.validEmail("abc.xyz@bl.co.in"));
            System.out.println("Email is Valid \n");
        }
        catch (InvalidEmailException e){
            System.out.println("A problem occurred: " + e);
        }
    }
    @Test
    public void sadEmail(){
        try{
            Assertions.assertFalse(UserValidation.validEmail("abc@"));
            System.out.println("Email is Invalid \n");
        }
        catch (InvalidEmailException e){
            System.out.println("A problem occurred: " + e);
        }
    }
    @Test
    public void happyMobileNumber() {
       try{
           Assertions.assertTrue(UserValidation.validMobileNumber("91 1234567890"));
           System.out.println("Phone Number is Valid \n");
       }
       catch (InvalidPhoneNumberException e){
           System.out.println("A problem occurred: " + e);
       }
    }
    @Test
    public void sadMobileNumber(){
       try{
           Assertions.assertFalse(UserValidation.validMobileNumber("91 1234578909888"));
           System.out.println("Phone Number is Invalid \n");
       }
       catch (InvalidPhoneNumberException e){
           System.out.println("A problem occurred: " + e);
       }
    }
    @Test
    public void happyPassword() {
       try{
           Assertions.assertTrue(UserValidation.validPassword("Qwerty@123"));
           System.out.println("Password is Valid \n");
       }
       catch (InvalidPasswordException e){
           System.out.println("A problem occurred: " + e);
       }
    }
    @Test
    public void sadPassword(){
       try{
           Assertions.assertFalse(UserValidation.validPassword("@1322424"));
           System.out.println("Password is Invalid \n");
       }
       catch (InvalidPasswordException e){
           System.out.println("A problem occurred: " + e);
       }
    }
}