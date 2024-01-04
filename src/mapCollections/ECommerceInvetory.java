package mapCollections;

import java.util.HashMap;
import java.util.Map;

public class ECommerceInvetory {

    private Map<Long, ECommerce> ecommerceInventory;

    public ECommerceInvetory(){
        this.ecommerceInventory = new HashMap<>();
    }

    public void addProduct(long code, String product, double value, int quantity){
        ecommerceInventory.put(code,new ECommerce(product,value,quantity));
    }

    public void getInventory(){
        System.out.println(ecommerceInventory);
    }

    /**
     * Calculates the total value of items in the E-commerce inventory.
     *
     * @return The total value of all items in the inventory.
     */
    public double getTotalValue(){
        double totalValue = 0d;
        if(!ecommerceInventory.isEmpty()){
            //metodh values
            for (ECommerce i:ecommerceInventory.values()) {
                totalValue += i.getQuantity() * i.getValue();
            }
        }
        return totalValue;
    }


    /**
     * Retrieves the item with the highest value from the E-commerce inventory.
     *
     * @return The item with the highest value in the inventory.
     */
    public ECommerce getHighValue(){
        ECommerce getHighValue = null;
        double highValue = Double.MIN_VALUE;
        if(!ecommerceInventory.isEmpty()){
            for (ECommerce i: ecommerceInventory.values()) {
                if(i.getValue() > highValue){
                    //refresh
                    highValue = i.getValue();
                    getHighValue = i;
                }
            }
        }
        return getHighValue;
    }

    /**
     * Retrieves the item with the lowest value from the E-commerce inventory.
     *
     * @return The item with the lowest value in the inventory.
     */
    public ECommerce getMinValue(){
        ECommerce getMinValue = null;
        double minValue = Double.MAX_VALUE;
        if(!ecommerceInventory.isEmpty()){
            for (ECommerce i: ecommerceInventory.values()) {
                if(i.getValue() < minValue){
                    minValue = i.getValue();
                    getMinValue = i;
                }
            }
        }
        return getMinValue;
    }

    /**
     * Retrieves the item with the highest quantity value from the E-commerce inventory.
     *
     * @return The item with the highest quantity value in the inventory.
     */
    public ECommerce getHighQuantity(){
        ECommerce getHighQuantity  = null;
        int highQuantity  = Integer.MIN_VALUE;
        if(!ecommerceInventory.isEmpty()){
            for (ECommerce i: ecommerceInventory.values()) {
                if(i.getQuantity() > highQuantity ){
                    highQuantity = i.getQuantity();
                    getHighQuantity  = i;
                }
            }
        }
        return getHighQuantity;
    }
}
