package setCollections.basicOperations;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Represents an order of items with various operations like addition and sorting.
 */
public class OrderSet {

    private Set<ItemSet> order;

    /**
     * Constructs an empty OrderSet.
     */
    public OrderSet(){
        this.order = new HashSet<>();
    }

    /**
     * Adds an item to the order with the given details.
     *
     * @param name     the name of the item
     * @param barCode  the barcode of the item
     * @param price    the price of the item
     * @param quantity the quantity of the item
     */
    public void addItem(long barCode, String name, double price, int quantity) {
        order.add(new ItemSet(barCode, name, price, quantity));
    }

    public void printOrder(){
        System.out.println(order);
    }
    /**
     * Sorts the items in the order by name.
     *
     * @return a sorted set of items by name
     * @throws RuntimeException if the order set is empty
     */
    public Set<ItemSet> sortByName(){
        //        //exception
//        if(!order.isEmpty()){
            return new TreeSet<>(order);
//        } else {
//            throw new RuntimeException("Empty order set.");
//        }
    }

    /**
     * Creates a TreeSet to sort ItemSet objects by price.
     * The TreeSet sortByPrice is a collection that holds objects of type ItemSet.
     * Objects are sorted using a specific Comparator (ComparatorByPrice)
     * that defines the order based on the price of the items.
     *
     * @return a sorted set of items by price
     */
    public Set<ItemSet> sortByPrice(){
        Set<ItemSet> sortByPrice = new TreeSet<>(new ComparatorByPrice());
        sortByPrice.addAll(order);
        return  sortByPrice;
    }

}
