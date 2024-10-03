/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author hemin
 */
public class Person {
    
    String firstName;
    String lastName;
    int SSN;
    byte age;
    double annualIncome;
    Address homeAddress;
    Address workAddress;
    
    public Person(String firstName, String lastName, int SSN, byte age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
        this.age = age;
    }
    
    public Person(){
        
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }
    
    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }
    
    public void setHomeAddress(String street, String city, String state, String zipCode, long phoneNumber) {
        this.homeAddress = new Address(street, city, state, zipCode, phoneNumber);
    }

    public void setWorkAddress(String street, String city, String state, String zipCode, long phoneNumber) {
        this.workAddress = new Address(street, city, state, zipCode, phoneNumber);
    }

    // Methods to get Home and Work Addresses which are only accecible thorugh perosn class
    public Address getHomeAddress() {
        return homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }
    
    
    @Override
    
    public String toString(){
        return firstName;
    }
}
