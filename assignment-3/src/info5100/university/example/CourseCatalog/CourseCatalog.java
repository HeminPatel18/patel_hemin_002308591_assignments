/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseCatalog;

import info5100.university.example.Department.Department;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kal bugrara
 */
public class CourseCatalog {
    Department department;
    String lastupdated;
    ArrayList<Course> courselist; 
    public CourseCatalog(Department d){
        this.courselist = new ArrayList();
        this.department = d;
        updateLastUpdated();
    }
    
    public ArrayList<Course> getCourseList(){
        return courselist;
    }
    
    public Course newCourse(String n, String nm, int cr,boolean isCoreSubject){
        Course c = new Course(n, nm, cr,isCoreSubject);
        courselist.add(c);
        return c;
    }

    public List<Course> getCoreCourses() {
        return courselist.stream()
                .filter(Course::isCoreSubject)
                .toList();
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getLastUpdated() {
        return lastupdated;
    }

    private void updateLastUpdated() {
        this.lastupdated = java.time.LocalDateTime.now().toString();
    }
    
    public Course getCourseByNumber(String n){
        
        for( Course c: courselist){
            
            if(c.getCOurseNumber().equals(n)) return c;
        }
        return null;
    }

}