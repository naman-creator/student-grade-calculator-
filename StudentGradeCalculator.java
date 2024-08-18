import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        // Create a scanner to get user input
        Scanner scanner = new Scanner(System.in);
        
        // Declare variables for storing subject marks
        double subject1, subject2, subject3, subject4, subject5;
        double totalMarks, percentage;
        char grade;
        
        // Get marks for five subjects from the user
        System.out.println("Enter marks for 5 subjects out of 100:");
        
        System.out.print("Subject 1: ");
        subject1 = scanner.nextDouble();
        
        System.out.print("Subject 2: ");
        subject2 = scanner.nextDouble();
        
        System.out.print("Subject 3: ");
        subject3 = scanner.nextDouble();
        
        System.out.print("Subject 4: ");
        subject4 = scanner.nextDouble();
        
        System.out.print("Subject 5: ");
        subject5 = scanner.nextDouble();
        
        // Calculate total marks and percentage
        totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        percentage = (totalMarks / 500) * 100;  // assuming each subject is out of 100 marks
        
        // Determine grade based on percentage
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        
        // Print the total marks, percentage, and grade
        System.out.println("Total Marks: " + totalMarks + "/500");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        
        // Close the scanner
        scanner.close();
    }
}