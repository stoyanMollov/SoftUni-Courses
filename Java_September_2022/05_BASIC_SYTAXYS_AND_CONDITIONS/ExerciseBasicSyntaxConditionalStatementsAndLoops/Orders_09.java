package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double priceCapsuls = 0.0;
        int days =0;
        int capsulesCount = 0;
        double total = 0.0;

        for (int i = 0; i < n; i++){
            priceCapsuls = Double.parseDouble(scan.nextLine());
            days = Integer.parseInt(scan.nextLine());
            capsulesCount = Integer.parseInt(scan.nextLine());

            double result = (days * capsulesCount) * priceCapsuls;

            System.out.printf("The price for the coffee is: $%.2f \n",result);
            total += (days * capsulesCount) * priceCapsuls;
        }

            System.out.printf("Total: $%.2f",total);
    }
}
