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

    public List<SeatAssignment> getSeatAssignments() {
        return Collections.unmodifiableList(seatassignments);
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
    
    public float getSemesterScore(){ //total score for a full semeter
        float sum = 0;
        for (SeatAssignment sa: seatassignments){
            sum = sum + sa.GetCourseStudentScore();
        }
        return sum;
    }
        public ArrayList<SeatAssignment> getSeatAssignments(){
            return seatassignments;
        }
            
}
