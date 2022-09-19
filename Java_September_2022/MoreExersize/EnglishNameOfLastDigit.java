package MoreExersize;

import java.util.Scanner;

public class EnglishNameOfLastDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        String result = PrintNumber(number);
        System.out.println(result);
    }

    private static String PrintNumber(int number) {
        int result = 0;
        int lastDigits = number % 10;
        if (lastDigits < 0){
            result = lastDigits * (-1);
        }
        else {
            result = lastDigits;
        }

        String digit = "";
        switch (result){
            case 0:
                digit = "zero";
                break;
            case 1:
                digit = "one";
                break;
            case 2:
                digit = "two";
                break;
            case 3:
                digit = "three";
                break;
            case 4:
                digit = "four";
                break;
            case 5:
                digit = "five";
                break;
            case 6:
                digit = "six";
                break;
            case 7:
                digit = "seven";
                break;
            case 8:
                digit = "eight";
                break;
            case 9:
                digit = "nine";
        }
        return digit;
    }
}
