
import java.util.Scanner;

//counting the number A from any given string

public class CountTheNumberAFromString {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String str = input.nextLine();

            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a') {
                    count++;
                }
            }

            System.out.println("Total number of 'a's in the string: " + count);
        }
    }

