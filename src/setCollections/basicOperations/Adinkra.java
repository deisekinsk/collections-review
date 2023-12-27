package setCollections.basicOperations;

import java.util.Objects;

public class Adinkra {

    private String adinkra;
    private String meanAdinkra;
    private boolean selectAdinkra;

    public Adinkra(String adinkra, String meanAdinkra) {
        this.adinkra = adinkra;
        this.meanAdinkra = meanAdinkra;
        this.selectAdinkra = false;
    }

    public String getAdikran(){
        return adinkra;
    }
    public String getMeanAdinkra(){return  meanAdinkra;}

    public boolean getSelectAdinkra(){return selectAdinkra;}

    public void setSelectAdinkra(boolean selectAdinkra) {
        this.selectAdinkra = selectAdinkra;
    }

    public void setMeanAdinkra(String meanAdinkra){
        this.meanAdinkra = meanAdinkra;
    }

    //set with unique adinkra
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Adinkra adinkra1)) return false;
        return Objects.equals(adinkra, adinkra1.adinkra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adinkra);
    }

    @Override
    public String toString() {
        return "\nAdinkra{" +
                "adinkra='" + adinkra + '\'' +
                ", meanAdinkra='" + meanAdinkra + '\'' +
                ", selectAdinkra=" + selectAdinkra +
                '}';
    }
}
