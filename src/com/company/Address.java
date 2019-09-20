package com.company;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Address {
    private String name = "";
    private String address = "";
    private String city = "";
    private String state = "";
    private String zip = "";
    private String phone = "";
    private String email = "";

    public Address() {
    }

    public Address(String name, String address, String city, String state, String zip, String phone, String email) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // What to return here? a string or an object
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (isPhoneNumberValid(phone)) {
            this.phone = phone;
        }else {
            this.phone = "Invalid Phone Number";
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)) {
            this.email = email;
        } else {
            this.email = "Invalid Email Address";
        }
    }

    private boolean isEmailValid(String email){
        boolean isValid = false;

        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        CharSequence inputStr = email;
        //Make the comparison case-insensitive.
        Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        if(matcher.matches()){
            System.out.println("Email has been verified");
            isValid = true;
        }
        else {
            System.out.println("Email is invalid.");
        }
        return isValid;
    }

    private boolean isPhoneNumberValid(String phoneNumber){
        boolean isValid = false;

        String expression = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";
        CharSequence inputStr = phoneNumber;
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(inputStr);
        if(matcher.matches()){
            isValid = true;
        }
        return isValid;
    }

//    private String name = "";
//    private String address = "";
//    private String city = "";
//    private String state = "";
//    private String zip = "";
//    private String phone = "";
//    private String email = "";

    public String displayAddress()
    {
        String outStr = "";
        outStr += "Name: " + getName() + "\n" + "Address: " + getAddress()  + "\n" + "City: " + getCity()  + "\n";
        outStr += "State: " + getState() + " Zip: " + getZip()  + "\n";
        outStr += "Ph: " + getPhone()  + "\n";
        outStr += "Email: " + getEmail();
        return outStr;
    }
}