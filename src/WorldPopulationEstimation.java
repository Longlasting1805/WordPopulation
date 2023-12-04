import java.util.Scanner;

public class WorldPopulationEstimation {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the current world population
        System.out.print("Enter the current population: ");
        long currentPopulation = input.nextLong();

        // Prompt the user to enter the annual world population growth rate (in percentage)
        System.out.print("Enter the annual world population growth rate (%): ");
        double growthRate = input.nextDouble() / 100.0;

        // Display the estimated world population after one, two, three, four, and five years
        System.out.println("\nEstimated World Population Growth");

        for (int years = 1; years <= 5; years++){
            long estimatedPopulation = (long) (currentPopulation * Math.pow(1 + growthRate, years));
            System.out.println("Year" + years + ":" + estimatedPopulation);
        }
    }
}
