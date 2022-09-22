package ProblemSolving;

import java.util.Scanner;

public class TheatrePromotions {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String typeOfDay = scan.nextLine().toLowerCase();

        int age = Integer.parseInt(scan.nextLine());
        double price = 0.0;

        if (typeOfDay.equals("weekday")){
            if ((age >= 0 && age <= 18) || (age > 64 && age <= 122) ){
                price = 12;
            } else if (age > 18 && age <= 64) {
                price = 18;
            }
        } else if (typeOfDay.equals("weekend")) {
            if ((age >= 0 && age <= 18) || (age > 64 && age <= 122) ){
               price = 15;
            } else if (age > 18 && age <= 64) {
                price = 20;
            }
        } else if (typeOfDay.equals("holiday")) {
            if ((age >= 0 && age <= 18)){
                price = 5;
            } else if (age > 18 && age <= 64) {
                price = 12;
            } else if ((age > 64 && age <= 122) ) {
                price = 10;
            }
        }if(price != 0) {
            System.out.printf("%.0f$",price);
        }else {
            System.out.println("Error!");
        }
    }
}
