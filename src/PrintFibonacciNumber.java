import java.util.Scanner;
//printing (Fibonacci number)
public class PrintFibonacciNumber {
          public static void main(String[] args) {
            Scanner keyboard=new Scanner(System.in);
            System.out.print("Enter numbers of terms (n):= ");
            int n = keyboard.nextInt();
            //Print the sequence
            System.out.print("Fibonacci sequence upto n terms:= ");
            for(int i=0;i<n;i++) {
                System.out.print (fibonacci(i)+ " ");//Invoking the recursive method
            }
        }
    public static long fibonacci(long n) {
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }
}

