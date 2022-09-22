package ProblemSolving;

import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        if (input.equals("USA") || input.equals("England") ){
            System.out.println("English");
        } else if (input.equals("Spain") || input.equals("Argentina")  || input.equals("Mexico")) {
            System.out.println("Spanish");
        }else{
            System.out.println("unknown");
        }
    }
}
