package ToDo.app;
import java.util.ArrayList;
import java.util.Scanner;

import ToDo.model.Tasks;


public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // <Tasks> prevent that anyother thing other than tasks will be added to the list
        ArrayList<Tasks> tasks = new ArrayList<>();

        Boolean newTask = true;

        while(newTask){

            System.out.println("Would you like to add a task? (y/n)");
            String response = sc.nextLine();

            newTask = response.equalsIgnoreCase("y") || response.equalsIgnoreCase("Y");

            if(newTask){

                System.out.println("Provide the name of the task: ");
                String id = sc.nextLine();
                System.out.println("Provide a discripiton for the task: ");
                String discription = sc.nextLine();
                System.out.println("Set the date that it is being added to the list (dd/mm/yy): ");
                String createdAt = sc.nextLine();
                String statusOptions = """
                        Choose a tasj status:
                        1. To Do;
                        2. In Progress;
                        3. Done
                        """;
                System.out.println(statusOptions);
                int choice = sc.nextInt();

                switch (statusOptions) {

                    case 1:
                        status = TO_DO;
                        break;
                    case 2:
                        status = IN_PROGRESS;
                        break;
                    case 3:
                        status = DONE;
                        break;
                
                    default:
                        break;
                }

            }

        }





        
        
        
    }
}