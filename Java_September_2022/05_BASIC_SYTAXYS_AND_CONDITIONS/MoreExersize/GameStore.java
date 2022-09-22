package MoreExersize;

import java.util.Scanner;

public class GameStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float budget = Float.parseFloat(scan.nextLine());
        String input = "";
        String game = "";
        double totalSum = 0;
        double totalResult = 0;
        double remainder = 0;

        while (true){
            input = scan.nextLine();
            if (input.equals("Game Time")){
                break;
            }
            totalSum = 0;
           switch (input){
               case "OutFall 4":
                   totalSum = 39.99;
                   game = "OutFall 4";

                   if (totalSum <= budget){
                       System.out.printf("Bought %s \n",game);
                   }else {
                       System.out.println("Too Expensive");
                   }
                   break;
               case "CS: OG":
                   totalSum = 15.99;
                   game = "CS: OG";

                   if (totalSum <= budget){
                       System.out.printf("Bought %s \n",game);
                   }else {
                       System.out.println("Too Expensive");
                   }
                   break;
               case "Zplinter Zell":
                   totalSum = 19.99;
                   game = "Zplinter Zell";
                   if (budget >= totalSum){
                       System.out.printf("Bought %s \n",game);
                   }else {
                       System.out.println("Too Expensive");
                   }
               case "Honored 2":
                   totalSum = 59.99;
                   game = "Honored 2";

                   if (totalSum <= budget){
                       System.out.printf("Bought %s \n",game);
                   }else {
                       System.out.println("Too Expensive");
                   }
                   break;
               case "RoverWatch":
                   totalSum = 29.99;
                   game = "RoverWatch";
                   if (totalSum <= budget){
                       System.out.printf("Bought %s \n",game);
                   }else {
                       System.out.println("Too Expensive");
                   }
                   break;
               case "RoverWatch Origins Edition":
                   totalSum = 39.99;
                   game = "RoverWatch Origins Edition";
                   if (totalSum <= budget){
                       System.out.printf("Bought %s \n",game);
                   }else {
                       System.out.println("Too Expensive");
                   }
                   break;
               default:
                   System.out.println("Not Found");
           }
           totalResult += totalSum;
        }
        if (totalResult <= budget){
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f\n",totalResult,(budget - totalResult));
        }else {
            System.out.println("Out of mo-ney!");
        }
    }
}
