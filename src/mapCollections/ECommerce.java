package mapCollections;

public class ECommerce {

    private String product;
    private double value;
    private int quantity;

    public ECommerce(String product, double value, int quantity) {
        this.product = product;
        this.value = value;
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public double getValue() {
        return value;
    }

    public int getQuantity() {
        return quantity;
    }



    @Override
    public String toString() {
        return "\nECommerce{" +
                "product='" + product + '\'' +
                ", value=" + value +
                ", quantity=" + quantity +
                '}';
    }
}
