package pack3;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private int age;
    private String roomNumber;

    // Constructor
    public Student(int id, String name, int age, String roomNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.roomNumber = roomNumber;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    // Display student details
    public void displayDetails() {
        System.out.printf("ID: %d | Name: %s | Age: %d | Room: %s%n", id, name, age, roomNumber);
    }
}

public class HostelManagementSystem {
    private final ArrayList<Student> students = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    // Method to add a new student
    private void addStudent() {
        System.out.println("\nAdd New Student");
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Room Number: ");
        String roomNumber = scanner.nextLine();

        students.add(new Student(id, name, age, roomNumber));
        System.out.println("Student added successfully!");
    }

    // Method to view all students
    private void viewStudents() {
        System.out.println("\nList of Students:");
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : students) {
                student.displayDetails();
            }
        }
    }

    // Method to update student information
    private void updateStudent() {
        System.out.print("\nEnter Student ID to Update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("Student found. Enter new details:");
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Age: ");
                int age = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                System.out.print("Enter Room Number: ");
                String roomNumber = scanner.nextLine();

                student.setName(name);
                student.setAge(age);
                student.setRoomNumber(roomNumber);
                System.out.println("Student details updated successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Method to remove a student
    private void removeStudent() {
        System.out.print("\nEnter Student ID to Remove: ");
        int id = scanner.nextInt();

        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                System.out.println("Student removed successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Main menu
    private void menu() {
        while (true) {
            System.out.println("\nHostel Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    removeStudent();
                    break;
                case 5:
                    System.out.println("Exiting the system. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Main method to start the system
    public static void main(String[] args) {
        HostelManagementSystem system = new HostelManagementSystem();
        system.menu();
    }
}
