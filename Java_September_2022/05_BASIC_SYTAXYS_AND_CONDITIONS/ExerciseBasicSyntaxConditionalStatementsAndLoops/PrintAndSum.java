package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startPoint = Integer.parseInt(scan.nextLine());
        int endPoint = Integer.parseInt(scan.nextLine());
        int result = 0;

        for (int i = startPoint; i <= endPoint; i++) {
            System.out.printf("%d ",i);
            result += i;
        }
        System.out.println();
        System.out.printf("Sum: %d",result);
    }
}
