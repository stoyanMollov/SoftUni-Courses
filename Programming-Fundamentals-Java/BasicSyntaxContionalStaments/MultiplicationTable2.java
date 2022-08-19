package ProblemSolving;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int input = Integer.parseInt(scan.nextLine());
        int startingPoint = Integer.parseInt(scan.nextLine());

        if (startingPoint <= 10) {
            for (int i = startingPoint; i <= 10; i++) {
                System.out.printf("%d" + " " + "X" + " " + "%d" + " " + "=" + " " + "%d" + "%n", input, i, (input * i));
            }
        }else{
            System.out.printf("%d" + " " + "X" + " " + "%d" + " " + "=" + " " + "%d",input,startingPoint,(input*startingPoint));
        }
    }
}
