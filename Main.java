    package CollegeMS;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Students> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt(); 

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    System.out.println("Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Course: ");
        String course = sc.next();

        list.add(new Students(id, name, age, course));
        System.out.println("Student Added Successfully!");
    }

    static void viewStudents() {
        if (list.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Students s : list) {
                System.out.println(
                    s.id + " | " + s.name + " | " + s.age + " | " + s.course
                );
            }
        }
    }

    static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();

        boolean found = false;
        for (Students s : list) {
            if (s.id == id) {
                list.remove(s);
                System.out.println("Student Deleted!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found!");
        }
    }
}



