package Attendance;
import java.util.Scanner;

public class AttendanceApp {
    public static void main(String[] args) {
        AttendanceManagement management = new AttendanceManagement();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("\nAttendance Management System");
            System.out.println("1. Add Attendance Record");
            System.out.println("2. View Attendance Records");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Date (YYYY-MM-DD): ");
                    String date = scanner.nextLine();
                    System.out.print("Is Present? (true/false): ");
                    boolean present = Boolean.parseBoolean(scanner.nextLine());
                    
                    AttendanceRecord record = new AttendanceRecord(name, date, present);
                    management.addRecord(record);
                    System.out.println("Attendance Record Added.");
                    break;

                case "2":
                    System.out.println("Attendance Records:");
                    management.displayRecords();
                    break;

                case "3":
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!choice.equals("3"));

        scanner.close();
    }
}

