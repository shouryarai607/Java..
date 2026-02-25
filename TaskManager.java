import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    private static final String FILE_NAME = "tasks.txt";
    public static void main(String[] args) {
        ArrayList<String> tasks = loadTasks();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Simple Task Manager ---");
        System.out.println("1. View Tasks | 2. Add Task | 3. Save & Exit");
        
        while (true) {
            System.out.print("\nChoose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.println("Your Tasks: " + tasks);
            } else if (choice == 2) {
                System.out.print("Enter task: ");
                tasks.add(scanner.nextLine());
            } else if (choice == 3) {
                saveTasks(tasks);
                System.out.println("Tasks saved. Goodbye!");
                break;
            }
        }
        scanner.close();
    }

    private static void saveTasks(ArrayList<String> tasks) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (String task : tasks) {
                writer.println(task);
            }
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }