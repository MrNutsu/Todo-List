package ToDo.model;

import java.util.UUID;

public class Tasks {
    
    String id = UUID.randomUUID().toString();
    String description;
    public enum status{

        'to-do',
        'in-progress',
        'done'
    }
    String createdAt; // dont really know if this is the most optimized way to set a date...
    String updatedAt; // dont really know if this is the most optimized way to set a date...
   


}
