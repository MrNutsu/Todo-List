package ToDo.app;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
import ToDo.status.Status;
import ToDo.status.mainMenu;
import ToDo.model.Tasks;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // <Tasks> prevent that any other thing other than tasks will be added to the list
        ArrayList<Tasks> tasksList = new ArrayList<>();
        mainMenu menu = new mainMenu();

        boolean newTask = true;

        while (newTask) {

            System.out.println(menu.getMenu());
            System.out.println("===================");
            System.out.print("Type your choice: ");
            int answer = sc.nextInt();
            sc.nextLine(); // consume enter

            switch (answer) {

                case 1:

                    boolean addMore = true;

                    while (addMore) {

                        System.out.println("Would you like to add a task? (y/n)");
                        String response = sc.nextLine();
                        addMore = response.equalsIgnoreCase("y") || response.equalsIgnoreCase("Y");

                        if (addMore) {

                            System.out.println("Provide a description for the task: ");
                            String description = sc.nextLine();

                            LocalDateTime createdAt = LocalDateTime.now();
                            System.out.println("Date that has been set for: " + createdAt);

                            String statusOptions = """
                                    Choose a task status:
                                    1. To Do
                                    2. In Progress
                                    3. Done
                                    """;

                            System.out.println(statusOptions);
                            int choice = sc.nextInt();
                            sc.nextLine(); // consume enter

                            Status status = null;

                            switch (choice) {

                                case 1:
                                    status = Status.TO_DO;
                                    break;
                                case 2:
                                    status = Status.IN_PROGRESS;
                                    break;
                                case 3:
                                    status = Status.DONE;
                                    break;
                                default:
                                    System.out.println("Invalid choice. Setting as default: To Do.");
                                    status = Status.TO_DO;
                                    break;
                            }

                            // creates the task with its description
                            Tasks task = new Tasks(description);
                            // sets task's status
                            task.setStatus(status);
                            // adds task
                            tasksList.add(task);
                        }
                    }
                    break;

                case 2:

                    

                    break;

                case 3:
                    System.out.println("====== Your To-Do List ======");
                    if (tasksList.isEmpty()) {
                    System.out.println("You don't have any task.");
                    } else {
                        // loop for-each
                        for (Tasks t : tasksList) {
                        System.out.println("");
                        System.out.println("Description: " + t.getDescription());
                        System.out.println("Status: " + t.getStatus());
                        System.out.println("Added: " + t.getCreatedAt());
                        if (!t.getUpdatedAt().isEqual(t.getCreatedAt())) {
                        System.out.println("Updated: " + t.getUpdatedAt());
                    }
                }
            }

                    break;

                case 4:

                    break;

                default:
                    break;
            }

        
            
        }

        sc.close();
    }
}
