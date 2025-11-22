package project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        RegistrationSystem system = new RegistrationSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Student Course Registration System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Register Student to Course");
            System.out.println("4. View All Students");
            System.out.println("5. View All Courses");
            System.out.println("6. View All Registrations");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    int sid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Student Name: ");
                    String sname = sc.nextLine();
                    system.addStudent(sid, sname);
                    break;

                case 2:
                    System.out.print("Enter Course ID: ");
                    int cid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Course Title: ");
                    String cname = sc.nextLine();
                    system.addCourse(cid, cname);
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    int stid = sc.nextInt();
                    System.out.print("Enter Course ID: ");
                    int coid = sc.nextInt();
                    system.registerStudent(stid, coid);
                    break;

                case 4:
                    system.viewStudents();
                    break;

                case 5:
                    system.viewCourses();
                    break;

                case 6:
                    system.viewRegistrations();
                    break;

                case 7:
                    System.out.println("Exiting system...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
