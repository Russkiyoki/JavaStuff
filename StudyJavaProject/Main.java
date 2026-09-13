// Elisey Voichishin final project
// 9/12/26 Study.com
import java.util.Scanner;

public class Main {
    // count for grades in the array 
    private static int count = 0;
    public static void main(String[] args) {
     // stuff here
        printSpecifications();
        int[] grades = inputLoop();
        printGrades(grades);
        double average = average(grades);
        printLetterGrade(average);

    }

    // Function to print the specifications of the project 
    // as specified by professor
    private static void printSpecifications(){
        System.out.println("Expand the Project Program and create Java code to input from the console (keyboard) the first quiz grade.");
        System.out.println("Use a loop to allow the user to continue to enter grades as long as they don't enter 999 to quit.");
        
        System.out.println("Expand the Project Program and create Java code to populate the array of the student's quiz grades.");
        System.out.println("The grade is added to a running total, and the count of grades entered is incremented.");
        System.out.println("The loop ends after 10 grades are entered. When the loop ends, count holds the number of grades entered.");

        System.out.println("Expand the Project Program and create Java code use another loop to print all grades in the array.");

        System.out.println("Expand the Project Program and create Java code to compute the average quiz grade.");
        System.out.println("Expand the Project Program and create Java code to use decision logic to find out the");
        System.out.println("letter grade of the average based on the following grading scale and print to the console.");

        // Grading scale
        System.out.println("A = 90-100");
        System.out.println("B = 80-89");
        System.out.println("C = 70-79");
        System.out.println("D = 60-69");
        System.out.println("F = 0-59");
    }

    // Function to input grades from the user and store them in an array
    private static int[] inputLoop(){
        Scanner scanner = new Scanner(System.in);
        // Loop either until 999 is entered or until 10 grades are entered
        int[] grades = new int[10];

        // while input is not 999 and grades array does not exceed 10 elements, continue to prompt for grades
        int grade = 0;
        while (grade != 999 && count < 10) {
            System.out.print("Enter a quiz grade (or 999 to quit): "); // basic prompting 
            grade = scanner.nextInt();
            if (grade == 999) { // our exit command
                break;
            }
            grades[count] = grade; // Store the grade in the array
            count++;
        }
        
        scanner.close(); // good habit to close scanners for bigger projects i hear
        return grades;
    }

    // Function to print the grades
    private static void printGrades(int[] grades) {
        System.out.println("Grades entered:");
        for (int i = 0; i < count; i++) {
            System.out.print(grades[i] + " ");
        }
        System.out.println(); // Print a new line after all grades are printed
    }

    // Function to calc the average 
    private static double average(int[] grades) {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += grades[i];
        }
        double avg = (double) sum / count;
        System.out.println("Average grade: " + avg);
        return avg;
    }

    // Function to print the letter grade based on the average
    private static void printLetterGrade(double avg) {
        char letterGrade;
        if (avg >= 90) {
            letterGrade = 'A';
        } else if (avg >= 80) {
            letterGrade = 'B';
        } else if (avg >= 70) {
            letterGrade = 'C';
        } else if (avg >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
        System.out.println("Letter grade: " + letterGrade);
    }
}