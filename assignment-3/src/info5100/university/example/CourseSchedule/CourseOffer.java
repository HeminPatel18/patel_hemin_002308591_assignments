/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.Persona.Faculty.FacultyAssignment;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.StudentAccount;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kal bugrara
 */
public class CourseOffer {

    private final Course course;
    private final List<Seat> seatList;
    private FacultyAssignment facultyAssignment;
    private final String semester;
    private int availableSeats;
    private List<StudentAccount> enrolledStudents = new ArrayList<>();
    private int totalRevenue = 0;

    public CourseOffer(Course c, String s) {
        this.course = c;
        this.semester = s;
        this.seatList = new ArrayList<>();
        this.availableSeats = 0;
        this.enrolledStudents = new ArrayList<>();
        this.totalRevenue = 0;
    }

    public Course getCourse() {
        return course;
    }
     
    public void AssignAsTeacher(FacultyProfile fp) {

        facultyAssignment = new FacultyAssignment(fp, this);
    }

    public FacultyProfile getFacultyProfile() {
        return facultyAssignment.getFacultyProfile();
    }

    public String getCourseNumber() {
        return course.getCOurseNumber();
    }

    public void generatSeats(int n) {

        for (int i = 0; i < n; i++) {

            seatList.add(new Seat(this, i));

        }

    }

    public Seat getEmptySeat() {

        for (Seat s : seatList) {

            if (!s.isOccupied()) {
                return s;
            }
        }
        return null;
    }


    public SeatAssignment assignEmptySeat(CourseLoad cl) {

        Seat seat = getEmptySeat();
        if (seat == null) {
            return null;
        }
        SeatAssignment sa = seat.newSeatAssignment(cl); //seat is already linked to course offer
        cl.registerStudent(sa); //coures offer seat is now linked to student
        return sa;
    }

    public int getTotalCourseRevenues() {

        int sum = 0;

        for (Seat s : seatList) {
            if (s.isOccupied() == true) {
                sum = sum + course.getCoursePrice();
            }

        }
        return sum;
    }
    public Course getSubjectCourse(){
        return course;
    }
    public int getCreditHours(){
        return course.getCredits();
    }

    public void generateSeats(int seats) {
        for (int i = 0; i < seats; i++) {
            Seat seat = new Seat(this, i + 1);
            seatList.add(seat);
        }
        this.availableSeats = seats;
    }

    public int getTotalRevenues() {
        return totalRevenue;
    }

    public int getAvailableSeats() {
        return getCourse().getSeatsAvailable() - enrolledStudents.size();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof CourseOffer)) return false;
        CourseOffer that = (CourseOffer) obj;
        return course.equals(that.course) && semester.equals(that.semester);
    }

    @Override
    public int hashCode() {
        return 31 * course.hashCode() + semester.hashCode();
    }

    @Override
    public String toString() {
        return "Course Offer: " + course.getName() +
                ", Course Number: " + course.getNumber() +
                ", Semester: " + semester +
                ", Seats Available: " + availableSeats;
    }

}
