import java.util.Scanner;

public class Calculator {
    public static void main(String[]args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.println("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Enter an operator (+, -, *, /)");
            char operator = scanner.next().charAt(0);

            double result = 0;

            switch (operator) {
                case '+' -> result = num1 + num2;
                case '-' -> result = num1 - num2;
                case '*' -> result = num1 * num2;
                case '/' -> {
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else{
                        System.out.println("Error! Division by zero is not allowed.");
                    }
                }
            }

            System.out.println("The result is: " + result);
        }

    }
}
