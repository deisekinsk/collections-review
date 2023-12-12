package list;

import java.util.ArrayList;
import java.util.List;

public class Order {
    //create object
    private List<Item> itemList;

    public Order(){
        this.itemList = new ArrayList<>();
    }

    //Add
    public void addItem(String name, double value, int qtd){
        Item item = new Item(name, value, qtd);
        this.itemList.add(item);
    }

    //remove
    public void removeItem(String name){
        //create a List with type of a class 'Item'
        List<Item> getItem = new ArrayList<>();

        //iteration on itemList
        for(int i = 0; i<itemList.size();++i){
            //get item
            Item item = itemList.get(i);
            //check string and add to list Item
            if (item.getName().equalsIgnoreCase(name)){
                getItem.add(item);
            }
        }
        itemList.removeAll(getItem);
    }

    public List<Item> getItemByName(String name){
        List<Item> itemByName = new ArrayList<>();

        for(int i = 0; i<itemList.size();++i){
            //get item
            Item item = itemList.get(i);
            //check string and add to list Item
            if (item.getName().equalsIgnoreCase(name)){
                itemByName.add(item);
            }
        }
        return itemByName;
    }

    public double totalValue(){
        double totalValue = 0d;

        for(int i = 0; i<itemList.size();++i){
            Item item = itemList.get(i);

            double getValue = item.getValue()*item.getQtd();
            totalValue = totalValue+getValue;

        }
        return totalValue;
    }

    //size
    public int sizeOrder(){
        return itemList.size();
    }

    public void printOrder(){
        System.out.println(itemList);
    }


}
