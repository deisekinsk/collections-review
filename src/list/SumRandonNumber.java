package list;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SumRandonNumber {

    private List<Integer> numbersList;

    public SumRandonNumber(){
        this.numbersList = new ArrayList<>();
    }

    public void addRandonNumbers(){
        Random random = new Random();

        for(int i = 0; i< 10;i++){
            //Choose number 0 to 99
            int randonNum = random.nextInt(100);
            numbersList.add(randonNum);
        }

    }

    public List<Integer>getNumbersList(){
        return numbersList;
    }

    public int getSumNumber(){
        int sum = 0;
        for(int i = 0; i<numbersList.size(); i++){
            Integer number = numbersList.get(i);
            sum = sum + number;
        }
        return sum;
    }

    public int getMinNumber(){
        int minNumber = Integer.MAX_VALUE;

        for(int i = 0; i<numbersList.size();i++){
            Integer number = numbersList.get(i);
            if(number<=minNumber){
                minNumber = number;
            }

        }
        return (minNumber);
    }

    public int getMmaxNumber(){
        int maxNumber = Integer.MIN_VALUE;

        for(int i = 0; i<numbersList.size();i++){
            Integer number = numbersList.get(i);
            if(number>=maxNumber){
                maxNumber = number;
            }

        }
        return (maxNumber);
    }

}
