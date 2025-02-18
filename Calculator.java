import java.util.Scanner;

public class Calculator {
    public static void main(String[]args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;

            boolean valid = false;
            do{
                System.out.print("Enter an operator (+, -, *, /): ");
                char operator = scanner.next().charAt(0);

                switch (operator) {
                    case '+' -> {
                        result = num1 + num2;
                        valid = true;}
                    case '-' -> {
                        result = num1 - num2;
                        valid = true;}
                    case '*' -> {
                        result = num1 * num2;
                        valid = true;}
                    case '/' -> {
                        if (num2 != 0) {
                            result = num1 / num2;
                            valid = true;
                        } else{
                            System.out.println("Error! Division by zero is not allowed.");
                        }
                    }
                    default -> System.out.println("\nError! Invalid operator. Try again.\n");
                }
            }while (!valid);

            System.out.println("The result is: " + result);
        }

    }
}
