package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidationTest {
    UserValidation obj = new UserValidation();
    @Test
    public void happyFirstName() {
        Assertions.assertTrue(obj.validFirstName("Ani"));

    }
    @Test
    public void sadFirstName(){
           Assertions.assertFalse(obj.validFirstName("anirban Roy"));
}

    @Test
    public void happyLastName() {
            Assertions.assertTrue(obj.validLastName("Roy"));
    }

    @Test
    public void sadLastName() {
            Assertions.assertFalse(obj.validLastName("anirban Roy"));
    }
    @Test
    public void happyEmail() {
            Assertions.assertTrue(obj.validEmail("abc.xyz@bl.co.in"));
    }
    @Test
    public void sadEmail(){
            Assertions.assertFalse(obj.validEmail("abc@"));
    }
    @Test
    public void happyMobileNumber() {
           Assertions.assertTrue(obj.validMobileNumber("91 1234567890"));
    }
    @Test
    public void sadMobileNumber(){
           Assertions.assertFalse(obj.validMobileNumber("91 1234578909888"));
    }
    @Test
    public void happyPassword() {
           Assertions.assertTrue(obj.validPassword("Qwerty@123"));
    }
    @Test
    public void sadPassword(){
           Assertions.assertFalse(obj.validPassword("@1322424"));

    }
}