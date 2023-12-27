package setCollections.basicOperations;

import java.util.Objects;

public class Adinkra {

    private String adinkra;

    public Adinkra(String adinkra) {
        this.adinkra = adinkra;
    }

    public String getAdikran(){
        return adinkra;
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
        return "Adinkra{" +
                "adikran=" + adinkra +"\n";
    }

}
