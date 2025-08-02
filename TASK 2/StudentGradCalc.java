import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user how many subjects
        System.out.print("Enter number of subjects: ");
        int numberOfSubjects = sc.nextInt();

        int totalMarks = 0;

        // Input marks for each subject
        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100): ");
            int marks = sc.nextInt();

         
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Please enter between 0 and 100.");
                i--; 
                continue;
            }

            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks / numberOfSubjects;
        
        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\n--- Result ---");
        System.out.println("Total Marks: " + totalMarks + " out of " + (numberOfSubjects * 100));
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
