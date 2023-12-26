import listCollections.*;
import setCollections.basicOperations.UserSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //LIST
        //TASK
        //creat object
        TaskList taskList = new TaskList();
        //add
        taskList.addTask("Lélia Gonzalez");
        taskList.addTask("Sueli Carneiro");
        taskList.addTask("Djamila Ribeiro");
        taskList.addTask("Carolina Maria de Jesus");

        taskList.removeTask("Lélia Gonzalez");
        System.out.println("Total elements: " + taskList.sizeList());
        taskList.printTasks();
        //ORDER
        Order orderList = new Order();
        //add
        orderList.addItem("🍬 Candy", 12.3, 3);
        orderList.addItem("🍿 Popcorn", 10.5, 1);
        orderList.addItem("🥤 Large Soda", 8.0, 2);
        orderList.addItem("🍫 Chocolate Bar", 5.75, 1);
        orderList.addItem("🍕 Slice of Pizza", 7.99, 2);
        orderList.addItem("☕ Coffee", 4.25, 1);
        //remove
        orderList.removeItem("☕ Coffee");
        //showSize
        System.out.println("Total Order Elements: " + orderList.sizeOrder());
        //total value | String.format | %.2f
        System.out.println(
                "Total Value: $ " + String.format("%.2f", orderList.totalValue()));
        //showList
        orderList.printOrder();

        System.out.println(orderList.getItemByName("🍫 Chocolate Bar"));

        BookList bookList = new BookList();

        bookList.addBook("Ponciá Vicêncio", "Conceição Evaristo", 2003);
        bookList.addBook("Dias & Dias", "Maria Firmina dos Reis", 1866);
        bookList.addBook("Úrsula", "Maria Firmina dos Reis", 1859);
        bookList.addBook("A Escrava Isaura", "Maria Firmina dos Reis", 1855);
        bookList.addBook("Quarto de Despejo: Diário de uma Favelada",
                "Carolina Maria de Jesus", 1960);
        bookList.addBook("Iyalodês: Fragmentos de Memórias e Autoconhecimento",
                "Esmeralda Ribeiro", 2020);
        bookList.addBook("Pequeno Manual Antirracista", "Djamila Ribeiro", 2019);
        bookList.addBook("O Canto da Sereia", "Capitu (Patrícia Melo)", 2000);

        System.out.println(bookList.getBookByAuthor("firmina"));
        System.out.println(bookList.getRangeOfYears(1855, 1866));
        System.out.println(bookList.getBookByTitle("favelada"));

        SumRandonNumber sumRandonNumber = new SumRandonNumber();

        sumRandonNumber.addRandonNumbers();
        System.out.println("\nRandom Numbers " + sumRandonNumber.getNumbersList());
        System.out.println("Sum of Numbers " + sumRandonNumber.getSumNumber());
        System.out.println("Minimum Number " + sumRandonNumber.getMinNumber());
        System.out.println("Maximum Number " + sumRandonNumber.getMmaxNumber());

        UserList user = new UserList();

        user.addUserList("Davi Kopenawa Yanomami", 66, 1.85);
        user.addUserList("Sonia Guajajara", 47, 1.60);
        user.addUserList("Ailton Krenak", 68, 1.75);
        user.addUserList("Raoni Metuktire", 92, 1.70);
        user.addUserList("Cacique Babau", 45, 1.80);
        user.addUserList("Damas Alves Guarani Kaiowá", 39, 1.68);
        user.addUserList("Megaron Txucarramãe", 57, 1.75);
        user.addUserList("Joenia Wapichana", 47, 1.65);
        user.addUserList("Marcivana Sateré Mawé", 34, 1.70);
        user.addUserList("Nara Baré", 44, 1.63);

        System.out.println(user.getUserByAge());
        System.out.println(user.getByHeight());

        //SET
        UserSet userSet = new UserSet();

        userSet.addUserSet("Obama", 175);
        userSet.addUserSet("Obama", 342);
        userSet.addUserSet("Obama", 342);


        userSet.printUserSet();
        System.out.println(userSet.countUserSet());

        userSet.removeUserSet(342);

        userSet.printUserSet();
        System.out.println(userSet.countUserSet());

    }
}