import java.util.Scanner;

public class VotingCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to vote!");
        } else {
            int yearsLeft = 18 - age;
            System.out.println("You are too young to vote.");
            System.out.println("Come back in " + yearsLeft + " years!");
        }