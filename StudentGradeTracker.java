import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Double> studentGrades = new ArrayList<>();

        System.out.println("===== Student Grade Tracker =====");

        while (true) {
            System.out.print("Enter student name (or type 'done' to finish): ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Enter grade for " + name + ": ");
            double grade = -1;

            // Validate grade input
            while (true) {
                try {
                    grade = Double.parseDouble(scanner.nextLine());
                    if (grade < 0 || grade > 100) {
                        System.out.print("Grade must be between 0 and 100. Enter again: ");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.print("Invalid input. Enter a number: ");
                }
            }

            studentNames.add(name);
            studentGrades.add(grade);
        }

        // Check if no students entered
        if (studentNames.isEmpty()) {
            System.out.println("\nNo student data entered. Exiting...");
            return;
        }

        // Calculate statistics
        double sum = 0;
        double highest = studentGrades.get(0);
        double lowest = studentGrades.get(0);
        int highestIndex = 0, lowestIndex = 0;

        for (int i = 0; i < studentGrades.size(); i++) {
            double grade = studentGrades.get(i);
            sum += grade;

            if (grade > highest) {
                highest = grade;
                highestIndex = i;
            }
            if (grade < lowest) {
                lowest = grade;
                lowestIndex = i;
            }
        }

        double average = sum / studentGrades.size();

        // Display report
        System.out.println("\n===== Student Grade Report =====");
        for (int i = 0; i < studentNames.size(); i++) {
            System.out.println(studentNames.get(i) + " : " + studentGrades.get(i));
        }

        System.out.println("\nTotal Students: " + studentNames.size());
        System.out.printf("Average Grade: %.2f\n", average);
        System.out.println("Highest Grade: " + highest + " ( " + studentNames.get(highestIndex) + " )");
        System.out.println("Lowest Grade : " + lowest + " ( " + studentNames.get(lowestIndex) + " )");

        System.out.println("================================");
    }
}