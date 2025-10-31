package ToDo.app;
import java.util.ArrayList;
import java.util.Scanner;

import ToDo.status.Status;
import ToDo.model.Tasks;


public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // <Tasks> prevent that anyother thing other than tasks will be added to the list
        ArrayList<Tasks> tasksList = new ArrayList<>();

        Boolean newTask = true;

        while(newTask){

            System.out.println("Would you like to add a task? (y/n)");
            String response = sc.nextLine();

            newTask = response.equalsIgnoreCase("y") || response.equalsIgnoreCase("Y");

            if(newTask){

                System.out.println("Provide a descripiton for the task: ");
                String description = sc.nextLine();
                System.out.println("Set the date that it is being added to the list (dd/mm/yy): ");
                String createdAt = sc.nextLine();
                String statusOptions = """
                        Choose a task status:
                        1. To Do;
                        2. In Progress;
                        3. Done
                        """;
                System.out.println(statusOptions);
                int choice = sc.nextInt();

                Status status = null;

                switch (choice){

                    case 1:

                        //status calls Status defined as To do
                        status = Status.TO_DO;
                        break;
                    case 2:
                        status = Status.IN_PROGRESS;
                        break;
                    case 3:
                        status = Status.DONE;
                        break;
                
                    default:
                        System.out.println("Invalide choice setting as defaul: To Do.");
                        status = Status.TO_DO; // default case.
                        break;
                }

                //creats the task with its own description
                Tasks task = new Tasks(description);
                //sets task's status
                task.setStatus(status);
                //adds task
                tasksList.add(task);
                //consumes a remanecent enter
                sc.nextLine();



            }

        }

        System.out.println("====== Your To-Do List ======");
        if(tasksList.isEmpty()){
            System.out.println("You dont have any task.");
        }else{
            System.out.println("");
            System.out.println("Description: " + task.getDescription());
            System.out.println("Status: " + task.getStatus());
            System.out.println("Added: " + task.getCreatedAt());

            if(task.setUpdatedAt = true){
                System.out.println("Uptated: " + task.getUpdatedAt());
            }else{
                System.out.println("");
            }
        }




        
        
        
    }
}