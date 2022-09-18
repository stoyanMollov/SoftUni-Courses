package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName = scan.nextLine();

        String password = "";

        for (int position = userName.length()-1; position >= 0; position--) {
            char currentSymbol = userName.charAt(position);
            password += currentSymbol;
        }
        String enteredPassword = scan.nextLine();
        int counter = 0;
        while(!enteredPassword.equals(password)){
            counter ++;
            if (counter == 4){
                System.out.printf("User %s blocked!",userName);
                break;
            }
            enteredPassword = scan.nextLine();
            System.out.println("Incorrect password. Try again.");
        }
        if (enteredPassword.equals(password)){
            System.out.printf("User %s logged in.",userName);
        }
    }
}
