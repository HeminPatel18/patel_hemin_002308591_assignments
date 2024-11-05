package info5100.university.example.Persona.Faculty;

import info5100.university.example.Persona.Person;
import info5100.university.example.Department.Department;
import info5100.university.example.CourseSchedule.CourseOffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class FacultyDirectory {

    private Department department; // The department the faculty directory belongs to
    private List<FacultyProfile> teacherList; // List of faculty profiles
    private List<CourseOffer> courseOffers; // List of course offers managed by the faculty


    public FacultyDirectory(Department d) {
        if (d == null) {
            throw new IllegalArgumentException("Department cannot be null");
        }
        this.department = d;
        this.teacherList = new ArrayList<>();
        this.courseOffers = new ArrayList<>(); // Initialize the course offers list
    }


    public FacultyProfile newFacultyProfile(Person person) {
        FacultyProfile facultyProfile = new FacultyProfile(person);
        teacherList.add(facultyProfile);
        return facultyProfile;
    }


    public void addCourseOffer(CourseOffer courseOffer) {
        courseOffers.add(courseOffer);
    }


    public Optional<CourseOffer> getCourseOffer(String courseNumber) {
        return courseOffers.stream()
                .filter(courseOffer -> courseOffer.getCourseNumber().equals(courseNumber))
                .findFirst();
    }


    public FacultyProfile getTopProfessor() {
        double bestRatingSoFar = 0.0;
        FacultyProfile bestProfSoFar = null;

        for (FacultyProfile facultyProfile : teacherList) {
            if (facultyProfile.getProfAverageOverallRating() > bestRatingSoFar) {
                bestRatingSoFar = facultyProfile.getProfAverageOverallRating();
                bestProfSoFar = facultyProfile;
            }
        }
        return bestProfSoFar;
    }


    public Optional<FacultyProfile> findTeachingFaculty(String id) {
        return teacherList.stream()
                .filter(facultyProfile -> facultyProfile.isMatch(id))
                .findFirst();
    }

    public List<FacultyProfile> getTeacherList() {
        return new ArrayList<>(teacherList); // Return a copy for encapsulation
    }

    // Getter for the department
    public Department getDepartment() {
        return department;
    }
}
