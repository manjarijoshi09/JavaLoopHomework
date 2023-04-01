
import java.util.Scanner;
//input number is prime or not
public class ProgrammePrimeOrNot {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            int i;
            for (i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    System.out.println(number + " is not a prime number.");
                    break;
                }
            }
            if (i > number / 2) {
                System.out.println(number + " is a prime number.");
            }
        }
    }