
// `public class Test` is defining a class named `Test` with public access modifier. This means that
// the class can be accessed from outside the package.
public class Test {
    // The `public static void main(String[] args)` method in Java is the entry point of a Java
    // program. When you run a Java program, the JVM (Java Virtual Machine) looks for this method to
    // start the execution of the program.
    public static void main(String[] args){
        // The line `System.out.println("Hello, World!");` is printing the text "Hello, World!" to the
        // standard output, which is typically the console or terminal where the program is being run.
        // This is a common way to display messages or information to the user when running a Java
        // program.
        System.out.println("Hello, World!");

        int age; // Declaration
        age = 25; // Initialization

        double salary = 50000.50; // Declaration AND Initialization
        char initial = 'A'; // Character variable
        boolean isActive = true; // Boolean Variable
        int a = 10;
        int b = 20;
        int sum = a + b;
        //System.out.println("Sum: " + sum);

        //implicit Casting
        int num = 100;
        double numDouble = num;
        //System.out.println(numDouble);
        //Explicit casting
        num = (int) numDouble;
        //System.out.println(num);

        // Control structures
        //If statement
        age = 70;
        if (age < 18) {
            //System.out.println("You a da'baby.");
        } else if ( age >= 18 && age < 60) {
            //System.out.println("You a grown ass adult");
        } else {
            //System.out.println("You old as fuck!");
        }

        //Switch statement
        int day = 3;
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid");
        }

        //for a loop
        for (int i = 1; i <= 5; i++){
            //System.out.println("Count: " + i);
        }
        //while loop
        int i = 1;
        while (i <= 10) {
            //System.out.println("Count: " + i);
            i++;
        }
    }
}
