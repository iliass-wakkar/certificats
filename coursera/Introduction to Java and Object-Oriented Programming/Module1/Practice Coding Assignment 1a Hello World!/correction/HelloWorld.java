import java.util.Scanner;

/**
 * For this first Java practice assignment, we will just have you program in the main method of your program.  
 * 
 * There are the six mini-programs we want you to code.  All of the code you write should be in the main method of the HelloWorld 
 * class in the “HelloWorld.java” file.
 * 
 * The main method has been defined for you, but without the code. See the comments for each mini-program for instructions on what 
 * each part is supposed to do and how to write the code. It should be clear enough.  In some cases, we have provided hints to help 
 * you get started.
 *  
 * Note: DO NOT skip any of the mini-programs or the automated testing will fail.
*/
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name (first and last): ");
        String fullName = scanner.nextLine();
        System.out.println("Hello, " + fullName + "!");
        printDivider();

        double sum = 0.0;
        System.out.println("Enter 5 numbers (ints or doubles):");
        for (int i = 0; i < 5; i++) {
            double num = scanner.nextDouble();
            sum += num;
            System.out.println("Sum: " + sum);
        }
        printDivider();

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
        printDivider();

        System.out.print("Enter a positive integer: ");
        int primeCheckNum = scanner.nextInt();
        if (primeCheckNum == 1) {
            System.out.println("1");
        } else if (isPrime(primeCheckNum)) {
            System.out.println(primeCheckNum + " is prime");
        } else {
            System.out.println(primeCheckNum + " is composite");
        }
        printDivider();

        System.out.print("Enter number of seconds: ");
        int seconds = scanner.nextInt();
        if (seconds < 0) {
            System.out.println("-1:-1:-1");
        } else {
            int hours = seconds / 3600;
            int minutes = (seconds % 3600) / 60;
            int remainingSeconds = seconds % 60;
            System.out.println(hours + ":" + minutes + ":" + remainingSeconds);
        }
        printDivider();

        System.out.println("Goodbye, " + fullName + "!");
        
        scanner.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void printDivider() {
        System.out.println("\n----------\n");
    }
}
