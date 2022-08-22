/*
Junit test to validate the user entry for first name, last name, email,
mobile and password
 */
package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
    /**
     * This method takes First Name which starts with Capital letter and has minimum of 3 characters
     * @param userFirstName is used for comparing with regex
     * @return it returns a boolean value true if the first name is valid
     */
    public static boolean validFirstName(String userFirstName) throws InvalidNameException{
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher = pattern.matcher(userFirstName);
        if (!matcher.matches()){
            throw new InvalidNameException("\n Invalid First Name as First Name should start with a cap and should have minimum 3 chars \n");
        }else return true;
    }
    /**
     * This method takes Last Name which starts with Capital letter and has minimum of 3 characters
     *
     * @param userLastName is used for comparing with regex
     *  @return it returns a boolean value true if the last name is valid
     */
    public static boolean validLastName(String userLastName) throws InvalidNameException {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher = pattern.matcher(userLastName);
        if (!matcher.matches()){
            throw new InvalidNameException("\n Invalid Last Name as Last Name should start with a cap and should have minimum 3 chars \n");
        }else return true;
    }
    /**
     * This method checks if the entered mail is valid or not
     *
     * @param userEmail is used for comparing with regex
     *  @return it returns a boolean value true if the email is valid
     */
    public static boolean validEmail(String userEmail) throws InvalidEmailException {
        Pattern pattern = Pattern.compile("^[a-z]+([_+.-]?[a-z0-9])*(@)(bl.co.)[a-z]{2}$");
        Matcher matcher = pattern.matcher(userEmail);
        if (!matcher.matches()){
            throw new InvalidEmailException("\n Invalid Email and enter a valid email - E.g. abc.xyz@bl.co.in \n Email has 3 mandatory parts \n" +
                    " (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions  \n");
        }else return true;
    }
    /**
     * This method checks if the entered number is valid or not
     * @param userMobileNumber takes in the parameter as String representation of number
     * @return it returns a boolean value true if the number is valid
     */
    public static boolean validMobileNumber(String userMobileNumber) throws InvalidPhoneNumberException {
        Pattern pattern = Pattern.compile("^[0-9]{2}[ ][1-9][0-9]{9}$");
        Matcher matcher = pattern.matcher(userMobileNumber);
        if (!matcher.matches()){
            throw new InvalidPhoneNumberException("\n Invalid Phone Number as Phone Number should start with country code followed by space and 10 digit number \n");
        }else return true;
    }
    /**
     * Method to check if the password is valid or not
     * @param userPassword takes in the password string as a parameter
     * @return returns boolean true if the password matches the requirement
     */
    public static boolean validPassword(String userPassword) throws InvalidPasswordException {
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*(){}'.,+_-])[a-zA-Z0-9 !@#$%^&*(){}'.,+_-]{8,}");  //
        Matcher matcher = pattern.matcher(userPassword);
        if (!matcher.matches()){
            throw new InvalidPasswordException("\n Invalid Password as Password should contain min 8 chars with at least: 1 capital letter, 1 numeric and exactly 1 special character  \n");
        }else return true;
    }

    public static void main(String[] args) {
        try {
            validFirstName("Anirban");
            System.out.println("First Name is valid");
        }
        catch (InvalidNameException e){
            System.out.println("A problem occurred: " + e);
        }

        try {
            validLastName("Roy");
            System.out.println("Last Name is valid");
        }
        catch (InvalidNameException e){
            System.out.println("A problem occurred: " + e);
        }

        try {
            validEmail("abc.xyz@gmail.com");
            System.out.println("Email is valid");
        }
        catch (InvalidEmailException e){
            System.out.println("A problem occurred: " +e);
        }

        try {
            validMobileNumber("91 1234567890");
            System.out.println("Mobile Number is valid");
        }
        catch (InvalidPhoneNumberException e){
            System.out.println("A problem occurred: " + e);
        }

        try {
            validPassword("qwQ12@121a");
            System.out.println("Password is valid");
        }
        catch (InvalidPasswordException e){
            System.out.println("A problem occurred: " + e);
        }
    }
}
