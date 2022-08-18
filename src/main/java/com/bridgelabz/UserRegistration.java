/*
User need to enter a valid password of 8 character with at least one upper case with
 one numeric number and one special character
 */
package com.bridgelabz;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        boolean firstName = givenFirstName_IfValid_ReturnTrue("Ani");
        System.out.println("Is first name valid ? \n" + firstName);
        boolean lastName = givenLastName_IfValid_ReturnTrue("Roy");
        System.out.println("Is last name valid ? \n" + lastName);
        boolean validUserEmail = givenEmail_IfValid_ReturnTrue("abc.xyz@bl.co.in");
        System.out.println("Is user email valid ? \n" + validUserEmail);
        boolean validUserMobileNum = givenMobileNum_IfValid_ReturnTrue("91 9919819801");
        System.out.println("Is user mobile number valid ? \n" + validUserMobileNum);
        boolean validUserPassword = givenPassword_IfValid_ReturnTrue("xyz12A$%");
        System.out.println("Is user password of minimum 8 char valid ? \n" + validUserPassword);
    }

    // This method takes First Name which starts with Capital letter and has minimum of 3 characters
    private static boolean givenFirstName_IfValid_ReturnTrue(String validFirstname) {
        return Pattern.matches("^[A-Z][a-z]{2,}", validFirstname);
    }

    public static boolean givenLastName_IfValid_ReturnTrue(String validLastName) {
        return Pattern.matches("^[A-Z][a-z]{2,}", validLastName);
    }

    public static boolean givenEmail_IfValid_ReturnTrue(String validUserEmail) {
        return Pattern.matches("^[a-z]+([_+.-]?[a-z0-9])*(@)(bl.co.)[a-z]{2}$", validUserEmail);
    }

    public static boolean givenMobileNum_IfValid_ReturnTrue(String validUserMobileNum) {
        return Pattern.matches("^[]0-9]{2}[\s][1-9][0-9]{9}", validUserMobileNum);
    }

    public static boolean givenPassword_IfValid_ReturnTrue(String validUserPassword) {
        return Pattern.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*(){}'.,+_-])[a-zA-Z0-9 !@#$%^&*(){}'.,+-_]{8,}", validUserPassword);
    }
}