/*Angwani,Aurelia Lois
 *CC2 1B
 *Final Challenge 3
 *11-19-2024
 */
 import java.util.Scanner;

public class UniversityCourse {

    public static void main(String[] args) {
        Scanner lois = new Scanner(System.in);

        // Define number of students and subjects
        int numStudents = 5;
        int numSubjects = 3;

        // Create arrays to store student names and grades
        String[] students = new String[numStudents];
        int[][] grades = new int[numStudents][numSubjects];

        // Collect student names and grades
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student #" + (i + 1) + ": ");
            students[i] = lois.nextLine(); // Store student name

            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Enter grade for subject " + (j + 1) + ": ");
                grades[i][j] = lois.nextInt(); // Store grade
            }
            lois.nextLine(); // Consume newline after entering grades
        }

        // Display each student's average grade
        System.out.println("\nStudent Average Grades:");
        for (int i = 0; i < numStudents; i++) {
            int sum = 0;
            for (int j = 0; j < numSubjects; j++) {
                sum += grades[i][j]; // Sum grades for each student
            }
            double average = sum / (double) numSubjects;
            System.out.printf("%s's Average Grade: %.2f\n", students[i], average);
        }

        lois.close();
    }
}
