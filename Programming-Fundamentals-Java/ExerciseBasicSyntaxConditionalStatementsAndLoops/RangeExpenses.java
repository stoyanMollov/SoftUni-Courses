package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class RangeExpenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int gameLost = Integer.parseInt(scan.nextLine());
        double headSetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyBoardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());

        int headsetCount = gameLost / 2;
        int mouseCount = gameLost / 3;
        int keyboardCount =  gameLost / 6;
        int displayCount = gameLost / 12;
        // Сума за слушалки = бр. слушалки * headsetPrice
        // сума за мишки = бр. мишки * mausePrice
        // сума за клавиатура = бр.  клавиатури * keyboardPrice
        // сума за монитори = бр. монитори * displayPrice
        // обща сума = сума за слушалки + сума за мишки + сума за клавиатури + сума за монитори

        double totalSum = (headsetCount * headSetPrice) +  (mouseCount * mousePrice) + (keyboardCount * keyBoardPrice)+
                (displayCount * displayPrice);

        System.out.printf("Rage expenses: %.2f lv.", totalSum);





    }
}
