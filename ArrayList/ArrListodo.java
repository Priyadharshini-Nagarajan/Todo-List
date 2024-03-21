
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrListodo{
    Logger logger = Logger.getLogger(getClass().getName());

        ArrayList<String> tasks = new ArrayList<>();
    
    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added successfully.");
    }

    public void markCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.set(index, tasks.get(index) + " (Completed)");
            System.out.println("Task marked as completed.");
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public void viewTasks() {
        if (!tasks.isEmpty()) {
            System.out.println("Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        } else {
            System.out.println("No tasks in the list.");
        }
    }

    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task deleted successfully.");
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public static void main(String[] args) {
        ArrListodo todoList = new ArrListodo();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. Mark Task as Completed");
            System.out.println("3. View All Tasks");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine();
                    todoList.addTask(task);
                    break;
                case 2:
                    System.out.print("Enter task index: ");
                    int markIndex = scanner.nextInt() - 1;
                    todoList.markCompleted(markIndex);
                    break;
                case 3:
                    todoList.viewTasks();
                    break;
                case 4:
                    System.out.print("Enter task index: ");
                    int deleteIndex = scanner.nextInt() - 1;
                    todoList.deleteTask(deleteIndex);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
    

