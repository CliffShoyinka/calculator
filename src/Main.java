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


        System.out.println("Please enter first number...");

        int num1 = input.nextInt();

        do {

            System.out.println("Please choose your operation... ");
            System.out.println("1- addition " +
                    "\n2- subtraction" +
                    "\n3- divide" +
                    "\n4- multiply " +
                    "\n5- reset" +
                    "\n0- exit");

            System.out.println();

            select = input.nextInt();

            if (select == 1 || select == 2 || select == 3 || select == 4 || select == 5) {


                System.out.println("Please enter second number...");

                int num2 = input.nextInt();

                switch (select) {

                    case 1:
                        num1 = num1 + num2 ;
                        System.out.println("Result: "+num1);
                        break;
                    case 2:
                        num1 = num1 - num2 ;
                        System.out.println("Result: "+num1);
                        break;
                    case 3:
                        num1 = num1 / num2 ;
                        System.out.println("Result: "+num1);
                        break;
                    case 4:
                        num1 = num1 * num2;
                        System.out.println("Result: "+num1);
                    case 5:
                        num1 = 0;
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