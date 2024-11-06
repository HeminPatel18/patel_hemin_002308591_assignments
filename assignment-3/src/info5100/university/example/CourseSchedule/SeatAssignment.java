/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

import info5100.university.example.CourseCatalog.Course;

/**
 *
 * @author kal bugrara
 */
public class SeatAssignment {
    float grade; //(Letter grade mappings: A=4.0, A-=3.7, B+=3.3, B=3.0, )
    Seat seat;
    boolean like; //true means like and false means not like
    CourseLoad courseload;
    public SeatAssignment(CourseLoad cl, Seat s){
        if (cl == null || seat == null) {
            throw new IllegalArgumentException("CourseLoad and Seat cannot be null");
        }
        this.courseload = cl;
        this.seat = seat;
        this.grade = 0.0f;
        this.like = false;
    }
     
    public boolean getLike(){
        return like;
    }

    public void setLike(boolean like) {
        this.like = like;
    }
    public void assignSeatToStudent(CourseLoad cl){
        courseload = cl;
    }
    
    public int getCreditHours(){
        return seat.getCourseCredits();
       
    }
    public Seat getSeat(){
        return seat;
    }
    public CourseOffer getCourseOffer(){
        
        return seat.getCourseOffer();
    }
    public Course getAssociatedCourse(){
        
        return getCourseOffer().getSubjectCourse();
    }
    public float GetCourseStudentScore(){
        return getCreditHours()*grade;
    }

    public void setGrade(float grade) {
        if (grade < 0.0f || grade > 4.0f) {
            throw new IllegalArgumentException("Grade must be between 0.0 and 4.0");
        }
        this.grade = grade;
    }

    public float getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "SeatAssignment{" +
                "seat=" + (seat != null ? seat.getNumber() : "null") +
                ", grade=" + grade +
                ", like=" + like +
                ", courseLoad=" + (courseload != null ? courseload.toString() : "null") +
                '}';
    }
    
    
    
}
