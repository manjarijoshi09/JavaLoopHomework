
//printing the numbers which can be divided by 3

public class PrintNumber1To100 {
        public static void main(String[] args) {
            System.out.println("Numbers divisible by 3:");
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println("\n\nNumbers divisible by 5:");
            for (int i = 1; i <= 100; i++) {
                if (i % 5 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }

