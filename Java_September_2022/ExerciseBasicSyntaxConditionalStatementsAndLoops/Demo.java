package ExerciseBasicSyntaxConditionalStatementsAndLoops;

public class Demo {
    public static void main(String[] args) {

        String text = "Acer";
        System.out.println(text.charAt(0));// връща символа на първа позиция
        System.out.println(text.charAt(text.length()));// Дължината на текста
        System.out.println(text.charAt(text.length()-1));// връща символа намиращ се на последна позиция

        String password = "";

        // Обръщане на текста с цикъл

        for (int position = text.length()-1; position >= 0; position--) {
            char currentSymbol = text.charAt(position);
            password += currentSymbol;
        }
    }
}
