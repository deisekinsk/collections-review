package list;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<Task> taskList;


    //empty constructor with object ArrayList
    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    //creat list

    public void insertTask (String description){
        taskList.add(new Task(description));
    }

    public void removeTask (String description){

    }
}
