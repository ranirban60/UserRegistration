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
     *
     * @param userFirstName is used for comparing with regex
     * @return it returns a boolean value true if the first name is valid
     */
    public boolean validFirstName(String userFirstName){
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher = pattern.matcher(userFirstName);
        return matcher.matches();
    }
    /**
     * This method takes Last Name which starts with Capital letter and has minimum of 3 characters
     *
     * @param userLastName is used for comparing with regex
     *  @return it returns a boolean value true if the last name is valid
     */
    public boolean validLastName(String userLastName) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher = pattern.matcher(userLastName);
        return matcher.matches();
    }
    /**
     * This method checks if the entered number is valid or not
     *
     * @param userEmail is used for comparing with regex
     * @return it returns a boolean value true if the email is valid
     */
    public boolean validEmail(String userEmail) {
        Pattern pattern = Pattern.compile("^[a-z]+([_+.-]?[a-z0-9])*(@)(bl.co.)[a-z]{2}$");
        Matcher matcher = pattern.matcher(userEmail);
        return matcher.matches();
    }
    /**
     * This method checks if the entered number is valid or not
     *
     * @param userMobileNumber takes in the parameter as String representation of number
     * @return it returns a boolean value true if the number is valid
     */
    public boolean validMobileNumber(String userMobileNumber) {
        Pattern pattern = Pattern.compile("^[0-9]{2}[ ][1-9][0-9]{9}$");
        Matcher matcher = pattern.matcher(userMobileNumber);
        return matcher.matches();
    }

    /**
     * Method to check if the password is valid or not
     * @param userPassword takes in the password string as a parameter
     * @return returns boolean true if the password matches the requirement
     */
    public boolean validPassword(String userPassword) {
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*(){}'.,+_-])[a-zA-Z0-9 !@#$%^&*(){}'.,+_-]{8,}");  //
        Matcher matcher = pattern.matcher(userPassword);
        return matcher.matches();
    }

    public static void main(String[] args) {
        UserValidation obj = new UserValidation();
        System.out.println(obj.validFirstName("Ani"));
        System.out.println(obj.validLastName("Roy"));
        System.out.println(obj.validEmail("abc.xyz@bl.co.in"));
        System.out.println(obj.validMobileNumber("91 1234567890"));
        System.out.println(obj.validPassword("Qwerty@123"));
    }
}
