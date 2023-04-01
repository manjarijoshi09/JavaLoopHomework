import java.util.Scanner;

//Print Multiplication Table for any Number
public class TimeTable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int firstFactor = 0;
        int secondFactor = 0;
        System.out.print("Enter the first factor: ");
        firstFactor = s.nextInt();
        System.out.print("Enter the second factor: ");
        secondFactor = s.nextInt();
        for(int i=1; i<=firstFactor; i++) {
            for(int j=1; j<=secondFactor; j++) {
                System.out.println(i + " * " + j + " = " + i*j);
            }
            System.out.println();
        }
    }
}
