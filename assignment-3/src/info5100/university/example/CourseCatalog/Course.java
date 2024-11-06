/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseCatalog;

import info5100.university.example.Persona.StudentProfile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author kal bugrara
 */
public class Course {

    private String number;
    private String name;
    int credits;
    private static final int PRICE_PER_CREDIT = 1864; //per credit hour
    private boolean isCoreSubject;
    private static final int SEATS = 200;
    private int availableSeats;
    private int revenue;
    private List<StudentProfile> studentsEnrolled;



    public Course(String n, String numb, int ch, boolean isCoreSubject) {

        if (numb == null || numb.trim().isEmpty()) {
            throw new IllegalArgumentException("Course number cannot be null or empty.");
        }
        if (ch <= 0) {
            throw new IllegalArgumentException("Credits must be a positive number.");
        }

        this.name = n;
        this.number = numb;
        this.credits = ch;
        this.isCoreSubject = isCoreSubject;
        this.availableSeats = SEATS;
        this.revenue = 0;
        this.studentsEnrolled = new ArrayList<>();

    }

    public String getNumber() {
        return number;
    }

    public boolean isCoreSubject() {
        return isCoreSubject;
    }

    public boolean enrollStudent(StudentProfile student) {
        if (student == null) {
            throw new IllegalArgumentException("Student cannot be null.");
        }
        if (availableSeats > 0) {
            studentsEnrolled.add(student);
            availableSeats--;
            revenue += getCoursePrice();
            return true;
        }
        return false;
    }

    public String getCOurseNumber() {
        return number;
    }

    public int getCoursePrice() {
        return PRICE_PER_CREDIT * credits;

    }

    public int getCredits() {
        return credits;
    }


    public int getSeatsAvailable() {
        return availableSeats;
    }

    public void setSeatsAvailable(int seats) {
        if (seats < 0) {
            throw new IllegalArgumentException("Seats cannot be negative.");
        }
        this.availableSeats = seats;
    }

    public int getEnrolledCount() {
        return studentsEnrolled.size();
    }

    public double getEnrollmentPercentage() {
        return ((SEATS - availableSeats) / (double) SEATS) * 100;
    }

    public String getName() {
        return name;
    }

     public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Course name cannot be null or empty.");
        }
        this.name = name;
    }

    public void setCredits(int credits) {
        if (credits <= 0) {
            throw new IllegalArgumentException("Credits must be a positive number.");
        }
        this.credits = credits;
    }

    public int getTotalRevenue() {
        return revenue;
    }

    public List<StudentProfile> getEnrolledStudents() {
        return Collections.unmodifiableList(studentsEnrolled);
    }

    @Override
    public String toString() {
        return String.format("Course Name: %s, Course Number: %s, Credits: %d, Total Price: $%d, Seats Available: %d, Total Revenue: $%d",
                name, number, credits, getCoursePrice(), availableSeats, revenue);
    }
    
}