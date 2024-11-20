import java.util.Scanner;

/**
 * In this assignment, you will implement a simple game.  This game has 2 options for the user playing.  Based on user input, the 
 * user can choose to either convert time, from seconds to hours, minutes, and seconds, or calculate the sum of all digits in an integer.  
 * 
 * At the beginning of the game, the user will be prompted to input either 1 or 2, to indicate which option of the game they want 
 * to play.  1 will indicate converting time, and 2 will indicate calculating the sum of digits in an integer.
 * 
 * For converting time, the user will be prompted to input a number of seconds (as an int) and the program will call a method that 
 * will convert the seconds to time, in the format hours:minutes:seconds, and print the result.  For example, if the user enters 6734, 
 * the program will print the time, 1:52:14. As another example, if the user enters 10,000, the program should print 2:46:39.
 * 
 * For calculating the sum of digits in an integer, the user will be prompted to input a number (as a non-negative int) and the program will 
 * call a method to calculate the sum of the digits in that number, and print the result.  For example, if the user enters 321, 
 * the program will print the sum, 6, because the individual digits in the number add up to 6.  3 + 2 + 1 = 6.
 * 
 * Each method has been defined for you, but without the code. See the javadoc for each method for instructions on what the method 
 * is supposed to do and how to write the code. It should be clear enough.  In some cases, we have provided hints to help you get started.
 * 
*/

public class SimpleGame {

    public String convertTime(int seconds) {
        if (seconds < 0) {
            return "-1:-1:-1";
        }
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;
        return hours + ":" + minutes + ":" + remainingSeconds;
    }

    public int digitsSum(int input) {
        int sum = 0;
        while (input > 0) {
            sum += input % 10;
            input /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        SimpleGame game = new SimpleGame();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 for time conversion or 2 to calculate sum of digits:");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Enter seconds to convert:");
            int seconds = sc.nextInt();
            String time = game.convertTime(seconds);
            System.out.println("Converted time: " + time);
        } else if (choice == 2) {
            System.out.println("Enter a number to calculate sum of digits:");
            int number = sc.nextInt();
            int sum = game.digitsSum(number);
            System.out.println("Sum of digits: " + sum);
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
