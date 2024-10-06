import java.util.Scanner;

class HomePage {

  // Constants for menu options
  private static final String MENU_HEADER = "---------Welcome to Student Portal---------";
  private static final String MENU_PROMPT = "Choose one of the options..";
  private static final String MENU_FOOTER = "-------------------------------------------";
  private static final String[] OPTIONS = {
    "1. Add Student Information",
    "2. View Student Information",
    "3. Update Student Information",
    "4. Delete Student Information"
  };

  public static void main(String...args) {
    Scanner sc = new Scanner(System.in);

    displayMenu();
    int option = sc.nextInt();
    sc.nextLine(); // consume newline

    HandleStudentInfo studentInfo = new HandleStudentInfo();
    handleOption(option, sc, studentInfo);

    sc.close();
  }

  // Method to display the menu
  private static void displayMenu() {
    System.out.println();
    System.out.println(MENU_HEADER);
    System.out.println();
    System.out.println(MENU_PROMPT);
    System.out.println();

    for (String option: OPTIONS) {
      System.out.println(option);
    }

    System.out.println();
    System.out.println(MENU_FOOTER);
    System.out.println();
  }

  // Method to handle menu option
  private static void handleOption(int option, Scanner sc, HandleStudentInfo studentInfo) {
    switch (option) {
    case 1 -> studentInfo.addRecord(sc);
    case 2 -> studentInfo.viewRecord(sc);
    case 3 -> studentInfo.updateRecord(sc);
    case 4 -> studentInfo.deleteRecord(sc);
    default -> System.out.println("Invalid option! Please choose a valid one.");
    }
  }
}