import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Calculator");
        System.out.println("======================");
        System.out.println(". " +
                "\n." +
                "\n.");

        Scanner input = new Scanner(System.in);

        int select;

        int sum = 0;

        do {

            System.out.println("Please choose your operation... ");
            System.out.println("1- addition " +
                    "\n2- subtraction" +
                    "\n3- divide" +
                    "\n4- multiply " +
                    "\n0- exit");

            System.out.println();

            select = input.nextInt();

            if (select == 1 || select == 2 || select == 3 || select == 4) {

                System.out.println("Please enter first number...");

                int num1 = input.nextInt();

                System.out.println("Please enter second number...");

                int num2 = input.nextInt();

                switch (select) {

                    case 1:
                        sum = num1 + num2 ;
                        System.out.println("Result: "+sum);
                        break;
                    case 2:
                        sum = num1 - num2 ;
                        System.out.println("Result: "+sum);
                        break;
                    case 3:
                        sum = num1 / num2 ;
                        System.out.println("Result: "+sum);
                        break;
                    case 4:
                        sum = num1 * num2;
                        System.out.println("Result: "+sum);
                    default:
                        break;

                }

            } else if (select ==0) {

                System.out.println("Good bye...");

            }else {

                System.out.println();

                System.out.println("Please select '0, 1, 2, 3, 4'");
            }

        }while (select!=0);


    }
}