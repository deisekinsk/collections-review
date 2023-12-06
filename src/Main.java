import list.Order;
import list.Task;
import list.TaskList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //TASK
        //creat object
        TaskList taskList = new TaskList();

        //add
        taskList.addTask("Lélia Gonzalez");
        taskList.addTask("Sueli Carneiro");
        taskList.addTask("Djamila Ribeiro");
        taskList.addTask("Carolina Maria de Jesus");

        taskList.removeTask("Lélia Gonzalez");

        System.out.println("Total elements: " +taskList.sizeList());

        taskList.printTasks();


        //ORDER
        Order orderList = new Order();

        orderList.addItem("🍬 Candy", 12.3, 3);        orderList.addItem("🍿 Pipoca Grande", 10.5, 1);
        orderList.addItem("🍿 Popcorn", 10.5, 1);
        orderList.addItem("🥤 Large Soda", 8.0, 2);
        orderList.addItem("🍫 Chocolate Bar", 5.75, 1);
        orderList.addItem("🍕 Slice of Pizza", 7.99, 2);
        orderList.addItem("☕ Coffee", 4.25, 1);

        orderList.printOrder();

    }
}