import listCollections.*;
import mapCollections.ECommerce;
import mapCollections.ECommerceInvetory;
import mapCollections.Inventory;
import setCollections.basicOperations.AdinkraSet;
import setCollections.basicOperations.OrderSet;
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
        System.out.println("Total ItemSet Elements: " + orderList.sizeOrder());
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

        //adinkraSet
        AdinkraSet adinkraSet = new AdinkraSet();

        adinkraSet.addAdikranSet("Gye Nyame", "No one except God.");
        adinkraSet.addAdikranSet("Sankofa", "Go back and get it.");
        adinkraSet.addAdikranSet("Nyame Nti", "By God's grace.");
        adinkraSet.addAdikranSet("Duafe", "Comb.");
        adinkraSet.addAdikranSet("Adinkrahene", "Chief of the Adinkra symbols.");
        adinkraSet.addAdikranSet("Nsoromma", "Star.");
        adinkraSet.addAdikranSet("Akoma Ntoaso", "Unity of hearts.");
        adinkraSet.addAdikranSet("Dwennimmen", "Ram's horn.");
        adinkraSet.addAdikranSet("Aya", "Represents resilience and perseverance.");

        System.out.println("total " + adinkraSet.countAdikranSet());
        adinkraSet.printAdikranSet();
        adinkraSet.getAdinkraSet("Sankofa");

        adinkraSet.removeAdikranSet("Dwennimmen");
        System.out.println("total " + adinkraSet.countAdikranSet());
        System.out.println(adinkraSet.getAdinkraByName("Aya"));

        adinkraSet.updateAdinkraMean("Aya", "Represents resilience and perseverance. | " +
                "Representa resistência e perseverança.");

        System.out.println(adinkraSet.getAdinkraByName("Aya"));
        adinkraSet.removeAdikranSet("Dwennimen");
        System.out.println("total " + adinkraSet.countAdikranSet());

        adinkraSet.selectAdinkra("Sankofa");
        adinkraSet.selectAdinkra("Aya");
        adinkraSet.selectAdinkra("Nsoromma");

        System.out.println(adinkraSet.getSelectedAdinkra());

        adinkraSet.unselectedAdinkra("Nsoromma");

        System.out.println(adinkraSet.getSelectedAdinkra());

        System.out.println(adinkraSet.getUnselectedAdinkra());
        //adinkraSet.removeAll();

        System.out.println(adinkraSet.sortAdinkraSetByName());
        System.out.println(adinkraSet.sortAdinkraBySelected());

        //order

        OrderSet itemSet = new OrderSet();

        itemSet.addItem(9987766L, "Soda", 2.99, 5);
        itemSet.addItem(1122334L, "Chips", 1.5, 3);
        itemSet.addItem(4455667L, "Water", 1.0, 10);
        itemSet.addItem(778899L, "Cookies", 3.49, 4);
        itemSet.addItem(123456L, "Juice", 4.25, 6);

        itemSet.printOrder();

        System.out.println(itemSet.sortByName());
        System.out.println(itemSet.sortByPrice());

        //map
        Inventory inventory = new Inventory();

        inventory.addProduct("soap", 36154);
        inventory.addProduct("T-shirt", 35574);
        inventory.addProduct("shoes", 333);
        inventory.addProduct("sunflower", 3546864);

        inventory.getInventory();

        inventory.removeProduct("soap");

        inventory.getInventory();

        System.out.println(inventory.getBarCodeByProduct("shoes"));

        ECommerceInvetory eCommerceInventory = new ECommerceInvetory();

        eCommerceInventory.addProduct(123,"Chanel No. 5", 150.00,5);
        eCommerceInventory.addProduct(124, "Dior Sauvage", 120.00, 7);
        eCommerceInventory.addProduct(125, "Paco Rabanne 1 Million", 90.00, 4);
        eCommerceInventory.addProduct(126, "Creed Aventus", 400.00, 3);
        eCommerceInventory.addProduct(127, "Yves Saint Laurent Black Opium", 120.00, 6);
        eCommerceInventory.addProduct(128, "Giorgio Armani Acqua di Gio", 100.00, 8);

        System.out.println(eCommerceInventory.getHighQuantityValue());
        System.out.println(eCommerceInventory.getHighValue());
        System.out.println(eCommerceInventory.getMinValue());
        System.out.println(eCommerceInventory.getTotalValue());








    }
}