/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

import info5100.university.example.Persona.StudentAccount;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author kal bugrara
 */
public class CourseLoad {
    private final String semester;
    private final StudentAccount studentAccount;
    private List<SeatAssignment> seatassignments;
    private final HashMap<String, CourseOffer> courseOffers;
    
    public CourseLoad(String s, StudentAccount sa){
        seatassignments = new ArrayList();
        semester = s;
        studentAccount = sa;
        this.courseOffers = new HashMap<>();
    }

    public void addCourseOffer(CourseOffer courseOffer) {
        courseOffers.put(courseOffer.getCourseNumber(), courseOffer);
    }

    public CourseOffer getCourseOffer(String courseNumber) {
        return courseOffers.get(courseNumber);
    }

    public String getSemester() {
        return semester;
    }

    public StudentAccount getStudentAccount() {
        return studentAccount;
    }

    public SeatAssignment newSeatAssignment(CourseOffer co){
        
        Seat seat = co.getEmptySeat(); // seat linked to courseoffer
        if (seat==null) return null;
        SeatAssignment sa = seat.newSeatAssignment(this);
        seatassignments.add(sa);  //add to students course 
        return sa;
    }
    
    public void registerStudent(SeatAssignment sa){
        
        
        sa.assignSeatToStudent(this);
        seatassignments.add(sa);
    }

    public SeatAssignment registerStudentInClass(CourseOffer courseOffer) {
        if (courseOffer == null) {
            System.out.println("CourseOffer cannot be null.");
            return null;
        }

        // Check if the student is already registered for this course
        for (SeatAssignment sa : seatassignments) {
            if (sa.getCourseOffer().equals(courseOffer)) {
                System.out.println("Student already registered for " + courseOffer.getCourse().getName());
                return sa;
            }
        }

        Seat seat = courseOffer.getEmptySeat();
        if (seat == null) {
            System.out.println("No available seats in " + courseOffer.getCourseNumber());
            return null;
        }

        SeatAssignment seatAssignment = seat.newSeatAssignment(this);
        seatassignments.add(seatAssignment);
        courseOffer.enrollStudent(studentAccount);
        return seatAssignment;
    }
    
    public float getSemesterScore(){ //total score for a full semeter
        float sum = 0;
        for (SeatAssignment sa: seatassignments){
            sum = sum + sa.GetCourseStudentScore();
        }
        return sum;
    }
    public List<SeatAssignment> getSeatAssignments(){
        return seatassignments;
    }
            
}
