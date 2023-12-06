package list;

import java.util.ArrayList;
import java.util.List;

public class Order {
    //create object
    private List<Item> itemList;

    public Order(){
        this.itemList = new ArrayList<>();
    }

    public void addItem(String name, double value, int qtd){
        Item item = new Item(name, value, qtd);
        this.itemList.add(item);
    }

    public void printOrder(){
        System.out.println(itemList);
    }


}
