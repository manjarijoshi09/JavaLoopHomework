
import java.util.Scanner;

//display n limit of natural numbers
public class N_LimitOfNaturalNumber {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a positive integer: ");
            int n = input.nextInt();

            int sum = 0;
            System.out.print("The first " + n + " natural numbers are: ");
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
                sum += i;
            }

            System.out.println("\nThe sum of the first " + n + " natural numbers is: " + sum);
        }
    }

