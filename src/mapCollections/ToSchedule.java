package mapCollections;

import java.time.LocalDate;
import java.util.*;

public class ToSchedule {

    private Map<LocalDate, Schedule> toSchedule;

    public ToSchedule(){
        this.toSchedule = new HashMap<>();
    }

    public void addEvent (LocalDate date, String event, String band){
        Schedule scheduler = new Schedule(event, band);
        toSchedule.put(date, scheduler);

    }
    //ordenation with treemap
    public void getSchedule(){
        Map<LocalDate, Schedule> getByDate = new TreeMap<>(toSchedule);
        System.out.println(getByDate);
    }

    /**
     * toSchedule.get(); doesn't work | //the format in 'now': 2024-01-05
     * ¹entrySet() / keySet()
     * The entrySet() method retrieves a collection of unique elements consisting of both keys and their corresponding values.
     * This method enables obtaining both the key and its associated value from a map or dictionary.
     * In contrast, keySet() returns only a set of unique keys without their respective values.
     * ²var
     *  In Java, 'var' allows declaring a variable without explicitly specifying its type,
     *  for instance, 'var i' instead of 'Map.Entry<LocalDate, Schedule> i'.
     *  This feature simplifies code by inferring the type from the assigned value,improving readability and reducing verbosity.
     */

    /**
     * Checks if a given date in 'i.getKey()' is equal to 'dateNow' or if it occurs after 'dateNow'.
     *
     * @param i The key from a map entry, assumed to be a LocalDate.
     * @param dateNow The reference date for comparison, assumed to be a LocalDate.
     * @return 'true' if the date in 'i.getKey()' is equal to 'dateNow' or occurs after it, otherwise 'false'.
     */
    public void getNextDate(){
        LocalDate dateNow = LocalDate.now();
        Map<LocalDate, Schedule> getByDate = new TreeMap<>(toSchedule);
        for(Map.Entry<LocalDate, Schedule> i:getByDate.entrySet()){
            if(i.getKey().isEqual(dateNow) || i.getKey().isAfter(dateNow)){
                System.out.println(i.getValue()+"|"+i.getKey());
                break;
            }
        }


    }





}
