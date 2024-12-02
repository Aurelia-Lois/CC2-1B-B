import java.util.Scanner;

public class ClassroomAttendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the total number of students
        System.out.print("Enter the total number of students: ");
        int totalStudents = sc.nextInt();
        
        // Initialize counts for present and absent
        int present = 0;
        int absent = 0;

        // Loop through each student to take attendance
        for (int i = 1; i <= totalStudents; i++) {
            System.out.print("Is student " + i + " present? (Y/N): ");
            char attendance = sc.next().charAt(0);
            
            // Check if the input is valid
            while (attendance != 'Y' && attendance != 'N') {
                System.out.print("Invalid input. Please enter Y for present or N for absent: ");
                attendance = sc.next().charAt(0);
            }

            // Update counts based on the attendance
            if (attendance == 'Y') {
                present++;
            } else {
                absent++;
            }
        }

        // Display the final counts
        System.out.println("Total present: " + present);
        System.out.println("Total absent: " + absent);

        // Close the scanner
        sc
        .close();
    }
}
