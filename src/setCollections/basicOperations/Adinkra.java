package setCollections.basicOperations;

import java.util.Objects;

public class Adinkra implements Comparable<Adinkra> {

    private String adinkra;
    private String meanAdinkra;
    private boolean isSelected;

    public Adinkra(String adinkra, String meanAdinkra) {
        this.adinkra = adinkra;
        this.meanAdinkra = meanAdinkra;
        this.isSelected = false;
    }

    @Override
    public int compareTo(Adinkra o) {
        return adinkra.compareToIgnoreCase(o.getAdikran());
    }

    public String getAdikran(){
        return adinkra;
    }
    public String getMeanAdinkra(){return  meanAdinkra;}

    public boolean isSelectAdinkra(){return isSelected;}

    public void setSelectAdinkra(boolean selectAdinkra) {
        this.isSelected = selectAdinkra;
    }

    public void setMeanAdinkra(String meanAdinkra){
        this.meanAdinkra = meanAdinkra;
    }

    //set with unique adinkra
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Adinkra adinkra1)) return false;
//        return Objects.equals(adinkra, adinkra1.adinkra);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(adinkra);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Adinkra adinkra1)) return false;
        return isSelected == adinkra1.isSelected && Objects.equals(adinkra,
                adinkra1.adinkra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adinkra, isSelected);
    }

    @Override
    public String toString() {
        return "\nAdinkra{" +
                "adinkra='" + adinkra + '\'' +
                ", meanAdinkra='" + meanAdinkra + '\'' +
                ", selectAdinkra=" + isSelected +
                '}';
    }
}
