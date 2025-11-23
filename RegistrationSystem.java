package project;

import java.util.ArrayList;
import java.util.List;

public class RegistrationSystem {

    private List<Student> students = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();
    private List<Registration> registrations = new ArrayList<>();

    public void addStudent(int id, String name) {
        students.add(new Student(id, name));
        System.out.println("Student added successfully!");
    }

    public void addCourse(int id, String title) {
        courses.add(new Course(id, title));
        System.out.println("Course added successfully!");
    }

    public void registerStudent(int studentId, int courseId) {
        Student student = null;
        Course course = null;

        for (Student s : students)
            if (s.getId() == studentId)
                student = s;

        for (Course c : courses)
            if (c.getId() == courseId)
                course = c;

        if (student == null || course == null) {
            System.out.println("Invalid student ID or course ID!");
            return;
        }

        registrations.add(new Registration(student, course));
        System.out.println("Registration successful!");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        students.forEach(System.out::println);
    }

    public void viewCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }
        courses.forEach(System.out::println);
    }

    public void viewRegistrations() {
        if (registrations.isEmpty()) {
            System.out.println("No registrations found.");
            return;
        }
        registrations.forEach(System.out::println);
    }
}
