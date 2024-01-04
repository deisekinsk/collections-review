package mapCollections;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    private Map<String, Integer> inventory;

    public Inventory() {
        this.inventory = new HashMap<>();
    }

    /**
     * Adds a product with its barcode to the inventory.
     *
     * @param product  The name of the product.
     * @param barCode  The barcode associated with the product.
     */
    public void addProduct(String product, Integer barCode){
        inventory.put(product, barCode);
    }

    public void getInventory(){
        System.out.println("\n"+inventory);
    }

    /**
     * Removes a product from the inventory by its name.
     *
     * @param product  The name of the product to be removed.
     */
    public void removeProduct(String product){
        if(!inventory.isEmpty()){
            inventory.remove(product);
        }
    }

    /**
     * Retrieves the barcode associated with a product.
     *
     * @param product  The name of the product to retrieve the barcode for.
     * @return The barcode associated with the specified product. Returns null if the product is not found.
     */
    public Integer getBarCodeByProduct(String product){
        Integer getBarCode = null;
        if(!inventory.isEmpty()){
            getBarCode = inventory.get(product);
        }
        return getBarCode;
    }


}
