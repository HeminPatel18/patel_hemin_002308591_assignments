/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Department;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Degree.Degree;
import info5100.university.example.Employer.EmployerDirectory;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentAccount;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

/**
 *
 * @author kal bugrara
 */
public class Department {

    private final String name;
    private final CourseCatalog courseCatalog;
    private final PersonDirectory personDirectory;
    private final StudentDirectory studentDirectory;
    private final FacultyDirectory facultyDirectory;
    private final EmployerDirectory employerDirectory;
    private final Degree degree;
    private final HashMap<String, CourseSchedule> masterCourseCatalog;

    public Department(String n) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Department name cannot be null or empty.");
        }

        this.name = name;
        this.masterCourseCatalog = new HashMap<>();
        this.courseCatalog = new CourseCatalog(this);
        this.studentDirectory = new StudentDirectory(this);
        this.personDirectory = new PersonDirectory();
        this.facultyDirectory = new FacultyDirectory(this);
        this.degree = new Degree("MSIS");
        this.employerDirectory = new EmployerDirectory(this);
    }

    public String getName() {
        return name;
    }

    public void addCoreCourse(Course c){
        degree.addCoreCourse(c);
        
    }
    public void addElectiveCourse(Course c){
        degree.addElectiveCourse(c);
        
    }
    public PersonDirectory getPersonDirectory() {

        return personDirectory;

    }

    public StudentDirectory getStudentDirectory() {
    return studentDirectory;
    }

    public CourseSchedule newCourseSchedule(String semester) {

        CourseSchedule cs = new CourseSchedule(semester, courseCatalog);
        masterCourseCatalog.put(semester, cs);
        return cs;
    }

    public CourseSchedule getCourseSchedule(String semester) {

        return masterCourseCatalog.get(semester);

    }

    public CourseCatalog getCourseCatalog() {

        return courseCatalog;

    }

    public Course newCourse(String n, String nm, int cr, boolean isCoreSubject) {

        Course c = courseCatalog.newCourse(n, nm, cr, isCoreSubject);
        return c;
    }

    public int calculateRevenuesBySemester(String semester) {

        CourseSchedule css = masterCourseCatalog.get(semester);

        return css.calculateTotalRevenues();

    }

    public FacultyDirectory getFacultyDirectory() {
        return facultyDirectory;
    }

    public void RegisterForAClass(String studentid, String cn, String semester) {

        StudentProfile sp = studentDirectory.findStudent(studentid);

        CourseLoad cl = sp.getCurrentCourseLoad();

        CourseSchedule cs = masterCourseCatalog.get(semester);

        CourseOffer co = cs.getCourseOfferByNumber(cn);

        co.assignEmptySeat(cl);

    }

    public boolean registerForClass(String studentId, String courseNumber, String semester) {
        StudentProfile studentProfile = studentDirectory.findStudent(studentId);
        if (studentProfile == null) {
            System.out.println("Student not found.");
            return false;
        }

        CourseSchedule courseSchedule = masterCourseCatalog.get(semester);
        if (courseSchedule == null) {
            System.out.println("Course schedule not found for the semester.");
            return false;
        }

        Optional<CourseOffer> optionalCourseOffer = courseSchedule.getCourseOffer(courseNumber);
        if (optionalCourseOffer.isEmpty()) {
            System.out.println("Course offer not found for the course number.");
            return false;
        }

        CourseOffer courseOffer = optionalCourseOffer.get();
        StudentAccount studentAccount = studentProfile.getStudentAccount();

        if (studentAccount == null) {
            System.out.println("Student account is null.");
            return false;
        }

        if (courseOffer.assignEmptySeat(studentAccount)) {
            CourseLoad courseLoad = studentProfile.getCourseLoadBySemester(semester);
            if (courseLoad == null) {
                courseLoad = studentProfile.newCourseLoad(semester);
            }
            SeatAssignment seatAssignment = courseLoad.newSeatAssignment(courseOffer);
            if (seatAssignment != null) {
                System.out.println("Student " + studentId + " registered for " + courseOffer.getCourse().getName());
                return true;
            } else {
                System.out.println("Failed to create seat assignment for student " + studentId);
                courseOffer.withdrawStudent(studentAccount); // Rollback the enrollment
                return false;
            }
        } else {
            System.out.println("Unable to register student, course offer is full.");
            return false;
        }
    }
    public void printCoreCourses() {
        ArrayList<Course> coreCourses = (ArrayList<Course>) courseCatalog.getCoreCourses();
        if (coreCourses.isEmpty()) {
            System.out.println("No core courses found in the catalog.");
            return;
        }
        System.out.println("Core Courses in the Catalog:");
        for (Course course : coreCourses) {
            System.out.println(formatCourseDetails(course));
        }
    }

    private String formatCourseDetails(Course course) {
        return String.format("Course Name: %s, Course Number: %s, Credits: %d",
                course.getName(), course.getNumber(), course.getCredits());
    }
}
}


