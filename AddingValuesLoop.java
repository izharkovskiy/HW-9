import java.util.Scanner;

public class AddingValuesLoop {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        int firstNum = 0;
        int sumNum = 0;

        System.out.println("I will add up the numbers you give me.");
        System.out.println(" ");

        do {
            firstNum = keyboard.nextInt();
            sumNum += firstNum;

        } while (firstNum != 0);

        System.out.println(sumNum);

        keyboard.close();
    }
}