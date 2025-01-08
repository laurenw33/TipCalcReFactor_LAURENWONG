import java.text.DecimalFormat;
import java.util.Scanner;

public class TipCalculatorRunner {
    public static void main(String[] args) {

        TipCalculator tipCalculator = new TipCalculator();
        System.out.println("---------------------------------");
        System.out.println("When inputting data, do NOT use any % or $.");
        System.out.println("---------------------------------");

        Scanner s = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Please enter bill amount: ");
        double billAmount = s.nextDouble();

        System.out.print("Please enter number of people in your party: ");
        int numPeople = s.nextInt();

        System.out.print("Please enter tip percentage: ");
        int tipPercent = s.nextInt();

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("Here is your bill!");
        System.out.println("---------------------------------");
        System.out.println("Total Bill (without tip): $" + billAmount);
        System.out.println("Tip Percentage: " + tipPercent + "%");
        System.out.println("Total Tip: $" + df.format(tipCalculator.totalTip()));
        System.out.println();
        System.out.println("Total Bill: $" + df.format(tipCalculator.billTotal(billAmount)));
        System.out.println("---------------------------------");
        System.out.println("Costs Per Person:");
        System.out.println();
        System.out.println("Total Tip: $" + df.format(tipCalculator.tipPP(numPeople)));
        System.out.println("Total Bill: $" + df.format(tipCalculator.billTotalPP(numPeople)));
        System.out.println("---------------------------------");

    }
}