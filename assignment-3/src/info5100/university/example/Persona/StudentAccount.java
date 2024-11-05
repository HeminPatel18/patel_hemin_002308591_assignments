/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseSchedule.SeatAssignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kal bugrara
 */
public class StudentAccount {
    private String studentID;
    private String firstName;
    private String lastName;
    private ArrayList<SeatAssignment> courseRegistrations;
    private HashMap<Course, Integer> grades;

    // Constructor to initialize student attributes
    public StudentAccount(String studentID, String firstName, String lastName) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseRegistrations = new ArrayList<>();
        this.grades = new HashMap<>();
    }

    // Register a course by adding a SeatAssignment
    public void registerCourse(SeatAssignment seatAssignment, int grade) {
        courseRegistrations.add(seatAssignment);
        assignGrade(seatAssignment.getAssociatedCourse(), grade); // Assuming getCourse() method returns the Course object
    }



    // Add a grade for a specific course
    public void assignGrade(Course course, int grade) {
        if (grade < 0 || grade > 4) { // Validate grade is within 0.0 to 4.0 range
            throw new IllegalArgumentException("Grade must be between 0 and 4.");
        }
        grades.put(course, grade);
    }


    // Get the grade for a specific course
    public int getCourseGrade(Course course) {
        return grades.getOrDefault(course, -1); // Return -1 for no grade assigned
    }


    // Calculate GPA based on assigned grades
    public double calculateGPA() {
        if (grades.isEmpty()) return 0.0; // Return 0.0 if no grades are available

        double totalGradePoints = 0.0;
        int totalCredits = 0;

        // Iterate over the grades to calculate total grade points and total credits
        for (Map.Entry<Course, Integer> entry : grades.entrySet()) {
            int gradePoints = entry.getValue(); // Ensure this value represents grade points
            int courseCredits = entry.getKey().getCredits();

            totalGradePoints += gradePoints * courseCredits; // Weight by course credits
            totalCredits += courseCredits; // Sum total credits
        }

        System.out.println("Total Grade Points: " + totalGradePoints + ", Total Credits: " + totalCredits);
        return totalCredits > 0 ? totalGradePoints / totalCredits : 0.0;
    }



    // Getters for student information
    public String getStudentID() {
        return studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<SeatAssignment> getCourseRegistrations() {
        return courseRegistrations;
    }


    @Override
    public String toString() {
        return "Student ID: " + studentID +
                ", Name: " + firstName + " " + lastName +
                ", Registered Courses: " + courseRegistrations.size() +
                ", GPA: " + calculateGPA();
    }
}

