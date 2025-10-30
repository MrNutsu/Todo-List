package ToDo.model;

import java.util.UUID;
import java.time.LocalDateTime;
import ToDo.status.Status;

public class Tasks {
    
    private String id = UUID.randomUUID().toString();
    private String description;
    private Status status;
    private LocalDateTime createdAt; // dont really know if this is the most optimized way to set a date...
    private LocalDateTime updatedAt; // dont really know if this is the most optimized way to set a date...
   
    public Tasks(String descripition){

        this.id = UUID.randomUUID().toString();
        this.description = descripition;
        this.status = Status.TO_DO; //default status
        this.createdAt = LocalDateTime.now(); //date of creatioo automatic
        this.updatedAt = LocalDateTime.now(); //date of update automatic
    }

    //I'll be only using get Id since I dont people to be able to creat a id
    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    //I'll be only using get createdAt since it'll be made by the program automatically (I hope so XD)
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

}
