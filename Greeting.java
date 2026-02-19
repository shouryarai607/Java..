import java.util.Scanner; // Import the Scanner tool to read input

public class Greeting {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = reader.nextLine();

        System.out.println("Hello, " + name + "! Welcome to Java.");
        
        reader.close();
    }
}