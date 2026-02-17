import java.util.Scanner;

public class TableGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to see its multiplication table: ");
        int num = scanner.nextInt();

        System.out.println("\nMultiplication Table for " + num + ":");
        System.out.println("---------------------------");

        
        // The 'for' loop: (start; condition; increment)for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + " x " + i + " = " + result);
        }

        scanner.close();
    }
}