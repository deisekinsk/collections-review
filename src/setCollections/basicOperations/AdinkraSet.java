package setCollections.basicOperations;

import java.util.HashSet;
import java.util.Set;

public class AdinkraSet {

    private Set<Adinkra> adinkraSet;

    public AdinkraSet(){
        this.adinkraSet = new HashSet<>();

    }

    public void addAdikranSet(String adinkra){
        adinkraSet.add(new Adinkra(adinkra));
    }

    public void printAdikranSet(){
        System.out.println(adinkraSet);
    }

    public void getAdinkraSet(String adikran){
        Adinkra getAdikranSet = null;
        for(Adinkra i:adinkraSet){
            if(i.getAdikran() == adikran){
                System.out.println("You find one valid word: "+adikran);
                break;
            }
        }
    }

    public void removeAdikranSet (String adinkra){
        Adinkra removeAdikranSet = null;
        for (Adinkra i:adinkraSet) {
            if(i.getAdikran() == adinkra){
                removeAdikranSet = i;
                break;
            }
        }
        adinkraSet.remove(removeAdikranSet);
    }

    public int countAdikranSet(){return  adinkraSet.size();}

}
