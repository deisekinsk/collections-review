package setCollections.basicOperations;

import java.util.HashSet;
import java.util.Set;

public class AdinkraSet {

    private Set<Adinkra> adinkraSet;

    public AdinkraSet(){
        this.adinkraSet = new HashSet<>();

    }

    public void addAdikranSet(String adinkra, String meanAdrinkra){
        adinkraSet.add(new Adinkra(adinkra, meanAdrinkra));
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

    public Set<Adinkra> getAdinkraByName (String adinkra){
        Set<Adinkra> adinkraByName = new HashSet<>();
        for(Adinkra i : adinkraSet){
            if(i.getAdikran().startsWith(adinkra)){
                adinkraByName.add(i);
            }
        }
        return adinkraByName;
    }

    public Adinkra updateAdinkraMean (String adinkra, String meanAdrinkra){
        Adinkra updateMean = null;
        for(Adinkra i: adinkraSet){
            if(i.getAdikran().equalsIgnoreCase(adinkra)){
                i.setMeanAdinkra(meanAdrinkra);
                updateMean = i;
                break;
            }
        }
        return updateMean;
    }

    public void removeAdikranSet (String adinkra){
        Adinkra removeAdikranSet = null;
        if(!adinkra.isEmpty()){
        for (Adinkra i:adinkraSet) {
            if(i.getAdikran() == adinkra){
                removeAdikranSet = i;
                break;
            }
        }
        adinkraSet.remove(removeAdikranSet);
        } else {
            System.out.println("Invalid value==empty");
        }
        if(removeAdikranSet == null){
            System.out.println("Invalid value==null");
        }
    }

    public void removeAll(){
        if (adinkraSet.isEmpty()) {
            System.out.println("Empty set");
        }else {
            adinkraSet.clear();
        }
    }
    public int countAdikranSet(){return  adinkraSet.size();}

    public void printAdikranSet(){
        if(!adinkraSet.isEmpty()) {
            System.out.println(adinkraSet);
        }else{
            System.out.println("Invalid Set");
        }
    }

    public void selectAdinkra(String adinkra){
        Adinkra selectAdinkraSet = null;
        for(Adinkra i : adinkraSet){
            if(i.getAdikran().equalsIgnoreCase(adinkra))
                i.setSelectAdinkra(true);
        }
    }

    public void unselectedAdinkra(String adinkra){
        Adinkra unlsecteAdinkraSet = null;
        for(Adinkra i:adinkraSet){
            if(i.getAdikran().equalsIgnoreCase(adinkra)) {
                unlsecteAdinkraSet = i;
                break;
            }
        }
        if(unlsecteAdinkraSet != null && unlsecteAdinkraSet.getSelectAdinkra()){
                unlsecteAdinkraSet.setSelectAdinkra(false);
        }else{
            System.out.println("Invalid value");
        }
    }

    public Set<Adinkra> getSelectedAdinkra(){
        Set<Adinkra> selectedAdinkra = new HashSet<>();
        for(Adinkra i: adinkraSet){
            if(i.getSelectAdinkra()){
                selectedAdinkra.add(i);
            }
        }

        return selectedAdinkra;
    }

    public Set<Adinkra> getUnselectedAdinkra(){
        Set<Adinkra> unselectedAdinkra = new HashSet<>();
        for(Adinkra i: adinkraSet){
            //use ! for get the unselected
            if(!i.getSelectAdinkra()){
                unselectedAdinkra.add(i);
            }
        }

        return unselectedAdinkra;
    }


}
