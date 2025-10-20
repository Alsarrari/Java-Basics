import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

            //task1.
Scanner input =new Scanner(System.in);
            System.out.print(" number own : ");
            double num1 = input.nextDouble();

            System.out.print(" number tow : ");
            double num2 = input.nextDouble();

            System.out.print(" number three : ");
            double num3 = input.nextDouble();

            double smallest = findSmallest(num1, num2, num3);
            System.out.println("The smallest value is " + smallest + "\n");
            //task2

            System.out.print("Enter a number: ");
            double number = input.nextDouble();
            checkNumber(number);
            System.out.println(number);
//task3.
            input.nextLine();
            System.out.print("enter password: ");
            String password = input.nextLine();
            if (isValidPassword(password)) {
                System.out.println("Password is valid: " + password);
            } else {
                System.out.println("Password is invalid.");
            }
        }

//Task1.
        public static double findSmallest(double a, double b, double c) {
            double smallest = a;
            if (b < smallest) smallest = b;
            if (c < smallest) smallest = c;
            return smallest;
        }
//Task2.
        public static void checkNumber(double number) {
            if (number > 0) {
                System.out.println("  positive.");
            } else if (number < 0) {
                System.out.println("  negative.");
            } else {
                System.out.println("  zero.");
            }
        }
//task3.
        public static boolean isValidPassword(String password) {
            if (password.length() < 10) {
                System.out.println("1. A password must have at least ten characters.");
                return false;
            }

            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);
                if (!Character.isLetterOrDigit(ch)) {
                    System.out.println("2. A password consists of only letters and digits.");
                    return false;
                }
            }

            int digitCount = 0;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    digitCount++;
                }
            }
            if (digitCount < 2) {
                System.out.println("3. A password must contain at least two digits.");
                return false;
            }

            return true;
        }
    }


