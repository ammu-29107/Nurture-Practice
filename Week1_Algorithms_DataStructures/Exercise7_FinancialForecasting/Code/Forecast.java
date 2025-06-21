import java.util.Scanner;

public class Forecast {

    public static double predictFutureValue(double initialValue, double growthRate, int years) {
        if (years == 0) return initialValue;
        return predictFutureValue(initialValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter initial investment, annual growth rate (as a decimal), and number of years:");
        double initialValue = scanner.nextDouble();
        double annualGrowthRate = scanner.nextDouble();
        int years = scanner.nextInt();

        double futureValue = predictFutureValue(initialValue, annualGrowthRate, years);
        System.out.printf("Predicted value after %d years: Rs. %.2f\n", years, futureValue);

        scanner.close();
    }
}
