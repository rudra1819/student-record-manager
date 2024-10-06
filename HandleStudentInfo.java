import java.util.*;

public class HandleStudentInfo {

  // Fields should be private to follow the principles of encapsulation
  private String name;
  private String enrollmentId;
  private int sem;

  // Method to add or update student information
  private void enterStudentInfo(Scanner sc) {
    System.out.print("Student Name: ");
    name = sc.nextLine();

    System.out.print("Student Enrollment Id: ");
    enrollmentId = sc.nextLine();

    System.out.print("Student Semester: ");
    sem = sc.nextInt();
    sc.nextLine(); // Consume newline character
  }

  // Method to add a new student record
  public void addRecord(Scanner sc) {
    enterStudentInfo(sc);
    System.out.println("\nInformation added successfully.");
  }

  // Method to view a student record
  public void viewRecord(Scanner sc) {
    System.out.print("Enter Enrollment Id to View Record: ");
    String id = sc.nextLine();

    // Check if the entered ID matches the student's ID
    if (id.equals(enrollmentId)) {
      System.out.println("\nDisplaying Information: ");
      System.out.println("Name: " + name);
      System.out.println("Enrollment Id: " + enrollmentId);
      System.out.println("Semester: " + sem);
    } else {
      System.out.println("No record found for Enrollment Id: " + id);
    }
  }

  // Method to update student information
  public void updateRecord(Scanner sc) {
    System.out.print("Enter Enrollment Id to Update Record: ");
    String id = sc.nextLine();

    // Check if the entered ID matches the student's ID
    if (id.equals(enrollmentId)) {
      enterStudentInfo(sc);
      System.out.println("\nInformation updated successfully.");
    } else {
      System.out.println("No record found for Enrollment Id: " + id);
    }
  }

  // Method to delete a student record
  public void deleteRecord(Scanner sc) {
    System.out.print("Enter Enrollment Id to Delete Record: ");
    String id = sc.nextLine();

    // Check if the entered ID matches the student's ID
    if (id.equals(enrollmentId)) {
      name = null;
      enrollmentId = null;
      sem = 0;
      System.out.println("\nInformation deleted successfully.");
    } else {
      System.out.println("No record found for Enrollment Id: " + id);
    }
  }
}