import java.util.Scanner;

public class TableGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to see its multiplication table: ");
        int num = scanner.nextInt();

        System.out.println("\nMultiplication Table for " + num + ":");
        System.out.println("---------------------------");
        {
            int result = num * i;
            System.out.println(num + " x " + i + " = " + result);
        }

         scanner.close();
    }
}