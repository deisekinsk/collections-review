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

    public void addTask(String description){
        Task task = new Task(description);
        this.taskList.add(task);
        //taskList.add(new Task(description));
    }

    public void removeTask (String description){
        //repetition for check and remove
        List<Task> getTasks = new ArrayList<>();
        //get the tasks
        for(int i = 0; i< taskList.size(); i++){
            Task task = taskList.get(i);
            //get the task from list
            if(task.getDescription().equalsIgnoreCase((description))) {
                getTasks.add(task);
            }
        }
        taskList.removeAll(getTasks);
    }
    public int sizeList() {
        return taskList.size();
    }

    public void printTasks() {
            System.out.println(taskList);

    }
}
