/*
Junit parameterized test to validate multiple entry for the email address
 */
package com.bridgelabz;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidation {
    public boolean validEmail(String email) {

        Pattern pattern = Pattern.compile("^(?!.*@.*@)[a-z+_-]+(.[a-z0-9])*@[a-z0-9]+(.[a-z])*.[a-z]{2,}$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        EmailValidation email = new EmailValidation();
        System.out.println(email.validEmail("abc@yahoo.com"));
        System.out.println(email.validEmail("abc-100@yahoo.com"));
        System.out.println(email.validEmail("abc.100@yahoo.com"));
        System.out.println(email.validEmail("abc111@abc.com"));
        System.out.println(email.validEmail("abc-100@abc.net"));
        System.out.println(email.validEmail("abc.100@abc.com.au"));
        System.out.println(email.validEmail("abc@1.com"));
        System.out.println(email.validEmail("abc@gmail.com.com"));
        System.out.println(email.validEmail("abc+100@yahoo.com"));
        System.out.println(" ");
        System.out.println(email.validEmail("abc"));
        System.out.println(email.validEmail("abc@.com.my"));
        System.out.println(email.validEmail("abc123@gmail.a"));
        System.out.println(email.validEmail("abc123@.com"));
        System.out.println(email.validEmail("abc123@.com.com"));
        System.out.println(email.validEmail(".abc@abc.com"));
        System.out.println(email.validEmail("abc()*@gmail.com"));
        System.out.println(email.validEmail("abc@%*.com"));
        System.out.println(email.validEmail("abc..2002@gmail.com"));
        System.out.println(email.validEmail("abc.@gmail.com"));
        System.out.println(email.validEmail("abc@abc@gmail.com"));
        System.out.println(email.validEmail("abc@gmail.com.1a"));
        System.out.println(email.validEmail("abc@gmail.com.aa.au"));
    }
}

