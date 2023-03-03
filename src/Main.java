import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Calculator");
        System.out.println("======================");
        System.out.println(". " +
                "\n." +
                "\n." +
                "\n." +
                "\n." +
                "\n." +
                "\n." +
                "\n.");

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first number...");

        int num1 = input.nextInt();

        System.out.println("Please enter second number...");

        int num2 = input.nextInt();

        System.out.println("Please choose your operation... ");

        int select = input.nextInt();

        int sum = 0;

        do {

            switch (select) {

                case 1:
                    sum = num1 + num2 ;

                    break;
                case 2:
                    sum = num1 - num2 ;
                    System.out.println(sum);
                    break;
                case 3:
                    sum = num1 / num2 ;
                    System.out.println(sum);
                    break;
                case 4:
                    sum = num1 * num2;
                    System.out.println(sum);
                case 0:
                    System.out.println(sum);
                    System.out.println("good bye...");
                    break;

            }

        }while (select!=0);

        System.out.println(sum);

    }
}