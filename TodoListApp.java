import java.util.ArrayList;
import java.util.Scanner;


class Task {
    private String title;
    private String description;
    private boolean isCompleted;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.isCompleted = false;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markAsComplete(){
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return (isCompleted ? "[x]": "[]") + title + ": " + description;
    }
}

class ToDoList {
    private ArrayList<Task> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String title, String description) {
        Task newTask = new Task(title, description);
        tasks.add(newTask);
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Invalid index. task not removed.");
        }
    }

    public void markTaskAsCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markAsComplete();
        } else {
            System.out.println("Invalid index. Task not marked as completed.");
        }
    }

    public void displayTasks(){
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + ":" + tasks.get(i));
            }
        }
    }
}

public class TodoListApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();
        String command;

        System.out.println("Welcom to the To-Do List Application");

        do {
            System.out.print("\nAvailable commands: add, emove, mark, display, exit");
            System.out.print("Enter command: ");
            command = scanner.nextLine().toLowerCase();

            switch (command) {
                case "add":
                System.out.print("Enter task title: ");
                String title = scanner.nextLine();
                System.out.print("Enter description: ");
                String description = scanner.nextLine();
                toDoList.addTask(title, description);
                break;

                case "remove":
                toDoList.displayTasks();
                System.out.println("Enter task index to remove: ");
                int removeIndex = Integer.parseInt(scanner.nextLine());
                toDoList.removeTask(removeIndex);
                break;

                case "mark":
                toDoList.displayTasks();
                System.out.println("Enter index of task to mark as completed: ");
                int markIndex = Integer.parseInt(scanner.nextLine());
                toDoList.markTaskAsCompleted(markIndex);
                break;

                case "display":
                toDoList.displayTasks();
                break;

                case "exit":
                System.out.println("Exiting application.");
                break;

                default:
                System.out.println("Invalid command. Please try again.");
            }

        } while (!command.equals("exit"));
        scanner.close();
    }
}