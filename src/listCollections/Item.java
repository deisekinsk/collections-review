//basicOperations

package listCollections;

public class Item {

    private String name;
    private double value;
    private  int qtd;

    public Item (String name, double value, int qtd){
        this.name = name;
        this.value = value;
        this.qtd = qtd;
    }

        //getter
    public String getName() {return name;}
    public double getValue() {return value;}
    public int getQtd() {return qtd;}

    //toString


    @Override
    public String toString() {
        return String.format("\n%s | $ %.2f | qtd %d", name, value, qtd);    }
}
