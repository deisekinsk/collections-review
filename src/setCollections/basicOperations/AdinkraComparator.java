package setCollections.basicOperations;

import java.util.Comparator;

public class AdinkraComparator implements Comparator<Adinkra> {

    public AdinkraComparator(){

    }

    @Override
    public int compare(Adinkra o1, Adinkra o2) {
        //compare tha same object and return set by boolean
        o2 = null;
        return Boolean.compare(!o1.isSelectAdinkra(),o1.isSelectAdinkra());
    }

}
