public import java.util.Scanner;

public class QuickStart {
    public static void main(String[] args) { {
    
}
var scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        Object input = scanner.nextLine();
        if (input instanceof String s && !s.isBlank()) {
            System.out.println("Hello, " + s.toUpperCase() + "!");
            System.out.println("Your name has " + s.length() + " letters.");
        } else {
            System.out.println("That doesn't look like a valid name.");
        }
    }
}
p