/*
User need to enter a valid First Name
 */
package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        boolean firstName = givenFirstName_IfValid_ReturnTrue("Ani");
        System.out.println("Is first name valid ? \n" + firstName);

    }

    // This method takes First Name which starts with Capital letter and has minimum of 3 characters
    private static boolean givenFirstName_IfValid_ReturnTrue(String validFirstname) {
        return Pattern.matches("^[A-Z][a-z]{2,}", validFirstname);
    }
}