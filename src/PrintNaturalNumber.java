
import java.util.Scanner;

//Sum of n Natural Number
public class PrintNaturalNumber {


    public static Scanner sc;
        public static void main(String[] args)
        {
            int number, i, sum = 0;
            sc = new Scanner(System.in);

            System.out.print(" Please Enter any Number : ");
            number = sc.nextInt();

            for(i = 1; i <= number; i++)
            {
                sum = sum + i;
            }

            System.out.println("\n The Sum of Natural Numbers from 1 to "+ number + " = " + sum);
        }
    }

