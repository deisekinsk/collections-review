package setCollections.basicOperations;

import java.util.Comparator;
import java.util.Objects;

/**
 * Represents an item with its details such as name, barcode, price, and quantity.
 */

public class ItemSet implements Comparable<ItemSet>{

    private String name;
    private long barCode;
    private double price;
    private int quantity;

    /**
     * Constructs an ItemSet with the given details.
     *
     * @param name     the name of the item
     * @param barCode  the barcode of the item
     * @param price    the price of the item
     * @param quantity the quantity of the item
     */

    public ItemSet(long barCode, String name, double price, int quantity) {
        this.name = name;
        this.barCode = barCode;
        this.price = price;
        this.quantity = quantity;
    }


    /**
     * Compares this item's name with another item's name ignoring case considerations.
     *
     * @param o the item to be compared
     * @return a negative integer, zero, or a positive integer as this item's name
     *         is less than, equal to, or greater than the specified item's name.
     */
    @Override
    public int compareTo(ItemSet o) {
        return name.compareToIgnoreCase(o.getName());
    }

    public String getName() {
        return name;
    }

    public long getBarCode() {
        return barCode;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    /**
     * Indicates whether some other object is "equal to" this one by comparing their barcodes.
     *
     * @param o the object to compare
     * @return true if the objects are equal based on their barcodes, otherwise false
     */
    //compareByCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ItemSet item)) return false;
        return getBarCode() == item.getBarCode();
    }

    /**
     * Generates a hash code for this item based on its barcode.
     *
     * @return the hash code value for this item
     */
    @Override
    public int hashCode() {
        return Objects.hash(getBarCode());
    }

    /**
     * Provides a string representation of the item, including its name, barcode, price, and quantity.
     *
     * @return a string representation of the item
     */
    @Override
    public String toString() {
        return "\nItemSet{" +
                "name='" + name + '\'' +
                ", barCode=" + barCode +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

}

/**
 * ComparatorByPrice is a comparator used to compare items based on their price.
 */
class ComparatorByPrice implements Comparator<ItemSet>{
    /**
     * Compares two items based on their price.
     *
     * @param o1 the first item to be compared
     * @param o2 the second item to be compared
     * @return a negative integer, zero, or a positive integer as the first item's price
     *         is less than, equal to, or greater than the second item's price
     */
    @Override
    public int compare(ItemSet o1, ItemSet o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}

