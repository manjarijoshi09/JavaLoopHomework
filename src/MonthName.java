
import java.util.Scanner;

//print month names with 1-12 – other invalid entry by
//using switch.
public class MonthName {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter month in number=");
        int month = scanner.nextInt();
        switch (month) {

            case 12:
                System.out.println("december");
                break;

            case 11:
                System.out.println("november");
                break;

            case 10:
                System.out.println("october");
                break;

            case 9:
                System.out.println("september");
                break;


            case 8:
                System.out.println("august");
                break;


            case 7:
                System.out.println("july");
                break;

                case 6:
                System.out.println("june");
                break;


            case 5:
                System.out.println("may");
                break;

            case 4:
                System.out.println("april");
                break;


            case 3:
                System.out.println("march");
                break;


            case 2:
                System.out.println("february");
                break;


            case 1:
                System.out.println("january");
                break;

            default:

                System.out.println("invalid entry");


        }

    }
}
