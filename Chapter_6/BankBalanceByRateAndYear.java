import java.util.Scanner;

public class BankBalanceByRateAndYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for initial balance
        System.out.print("Enter initial bank balance > ");
        double initialBalance = input.nextDouble();

        // Interest rates
        double[] rates = {0.02, 0.03, 0.04, 0.05};

        // Outer loop: for each interest rate
        for (int i = 0; i < rates.length; i++) {
            double rate = rates[i];
            double balance = initialBalance;

            System.out.println();
            System.out.printf("With an initial balance of %.1f at an interest rate of %.2f%n",
                    initialBalance, rate);

            // Inner loop: for each year (1–4)
            for (int year = 1; year <= 4; year++) {
                balance = balance + (balance * rate);
                System.out.printf("After year %d balance is %.4f%n", year, balance);
            }
        }

        input.close();
    }
}