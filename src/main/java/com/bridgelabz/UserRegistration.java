/*
Sample Emails validation
 */

package com.bridgelabz;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        boolean firstName = givenFirstName_IfValid_ReturnTrue("Ani");
        System.out.println("Is first name valid ? \n" + firstName);
        System.out.println();
        boolean lastName = givenLastName_IfValid_ReturnTrue("Roy");
        System.out.println("Is last name valid ? \n" + lastName);
        System.out.println();
        boolean validUserEmail = givenEmail_IfValid_ReturnTrue("abc.xyz@bl.co.in");
        System.out.println("Is user email valid ? \n" + validUserEmail);
        System.out.println();
        boolean validUserMobileNum = givenMobileNum_IfValid_ReturnTrue("91 9919819801");
        System.out.println("Is user mobile number valid ? \n" + validUserMobileNum);
        System.out.println();
        boolean validUserPassword = givenPassword_IfValid_ReturnTrue("xyz12A$%");
        System.out.println("Is user password of minimum 8 char and at least 1 upper case,1 num,1 special char valid ? \n" + validUserPassword);
        System.out.println();
        boolean validSampleEmail1 = givenSampleEmail_IfValid_ReturnTrue("abc@yahoo.com");
        System.out.println("Is email valid ? \n" + validSampleEmail1);
        boolean validSampleEmail2 = givenSampleEmail_IfValid_ReturnTrue("abc-100@yahoo.com");
        System.out.println("Is email valid ? \n" + validSampleEmail2);
        boolean validSampleEmail3 = givenSampleEmail_IfValid_ReturnTrue("abc.100@yahoo.com");
        System.out.println("Is email valid ? \n" + validSampleEmail3);
        boolean validSampleEmail4 = givenSampleEmail_IfValid_ReturnTrue("abc111@abc.com");
        System.out.println("Is email valid ? \n" + validSampleEmail4);
        boolean validSampleEmail5 = givenSampleEmail_IfValid_ReturnTrue("abc-100@abc.net");
        System.out.println("Is email valid ? \n" + validSampleEmail5);
        boolean validSampleEmail6 = givenSampleEmail_IfValid_ReturnTrue("abc.100@abc.com.au");
        System.out.println("Is email valid ? \n" + validSampleEmail6);
        boolean validSampleEmail7 = givenSampleEmail_IfValid_ReturnTrue("abc@1.com");
        System.out.println("Is email valid ? \n" + validSampleEmail7);
        boolean validSampleEmail8 = givenSampleEmail_IfValid_ReturnTrue("abc@gmail.com.com");
        System.out.println("Is email valid ? \n" + validSampleEmail8);
        boolean validSampleEmail9 = givenSampleEmail_IfValid_ReturnTrue("abc+100@yahoo.com");
        System.out.println("Is email valid ? \n" + validSampleEmail9);
        System.out.println();
        boolean validSampleEmail10 = givenSampleEmail_IfValid_ReturnTrue("abc");
        System.out.println("Is email valid ? \n" + validSampleEmail10);
        boolean validSampleEmail11 = givenSampleEmail_IfValid_ReturnTrue("abc@.com.my");
        System.out.println("Is email valid ? \n" + validSampleEmail11);
        boolean validSampleEmail12 = givenSampleEmail_IfValid_ReturnTrue("abc123@gmail.a");
        System.out.println("Is email valid ? \n" + validSampleEmail12);
        boolean validSampleEmail13 = givenSampleEmail_IfValid_ReturnTrue("abc123@.com");
        System.out.println("Is email valid ? \n" + validSampleEmail13);
        boolean validSampleEmail14 = givenSampleEmail_IfValid_ReturnTrue("abc123@.com.com");
        System.out.println("Is email valid ? \n" + validSampleEmail14);
        boolean validSampleEmail15 = givenSampleEmail_IfValid_ReturnTrue(".abc@abc.com");
        System.out.println("Is email valid ? \n" + validSampleEmail15);
        boolean validSampleEmail16 = givenSampleEmail_IfValid_ReturnTrue("abc()*@gmail.com");
        System.out.println("Is email valid ? \n" + validSampleEmail16);
        boolean validSampleEmail17 = givenSampleEmail_IfValid_ReturnTrue("abc@%*.com");
        System.out.println("Is email valid ? \n" + validSampleEmail17);
        boolean validSampleEmail18 = givenSampleEmail_IfValid_ReturnTrue("abc..2002@gmail.com");
        System.out.println("Is email valid ? \n" + validSampleEmail18);
        boolean validSampleEmail19 = givenSampleEmail_IfValid_ReturnTrue("abc.@gmail.com");
        System.out.println("Is email valid ? \n" + validSampleEmail19);
        boolean validSampleEmail20 = givenSampleEmail_IfValid_ReturnTrue("abc@abc@gmail.com");
        System.out.println("Is email valid ? \n" + validSampleEmail20);
        boolean validSampleEmail21 = givenSampleEmail_IfValid_ReturnTrue("abc@gmail.com.1a");
        System.out.println("Is email valid ? \n" + validSampleEmail21);
        boolean validSampleEmail22 = givenSampleEmail_IfValid_ReturnTrue("abc@gmail.com.aa.au");
        System.out.println("Is email valid ? \n" + validSampleEmail22);
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

    public static boolean givenSampleEmail_IfValid_ReturnTrue(String validEmailSample) {
        return Pattern.matches("^(abc)([+-.]?[\\d])*[@][0-9a-z]+([.][a-z]{2,3}){1,2}$", validEmailSample);
    }
}