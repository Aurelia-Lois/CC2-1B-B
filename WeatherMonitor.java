import java.util.Scanner;

public class WeatherMonitor{
    public static void main(String[] args) {
        // Create scanner to take input
        Scanner lois = new Scanner(System.in);
        
        // Number of cities and days
        final int Cities = 3;
        final int Days = 7;
        
        // Declare a 2D array to store temperatures for 3 cities over 7 days
        double[][] temperatures = new double[Cities][Days];
        
        // Input the temperatures for each city and each day
        for (int i = 0; i < Cities; i++) {
            System.out.println("Enter temperature data for City " + (i + 1) + ":");
            for (int j = 0; j < Days; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                temperatures[i][j] = lois.nextDouble();
            }
        }
        
        // Calculate and display the average temperature and highest temperature for each city
        for (int i = 0; i < Cities; i++) {
            double totalTemperature = 0;
            double highestTemperature = temperatures[i][0]; // Assume the first day's temp as the highest

            // Calculate total temperature and find the highest for the current city
            for (int j = 0; j < Days; j++) {
                totalTemperature += temperatures[i][j];
                if (temperatures[i][j] > highestTemperature) {
                    highestTemperature = temperatures[i][j];
                }
            }
            
            // Calculate the average temperature for the current city
            double averageTemperature = totalTemperature / Days;

            // Display the results for the current city
            System.out.println("\nCity " + (i + 1) + " Statistics:");
            System.out.printf("Average Temperature: %.2f°C\n", averageTemperature);
            System.out.printf("Highest Temperature: %.2f°C\n", highestTemperature);
        }
        
        // Close the scanner
        lois.close();
    }
}
