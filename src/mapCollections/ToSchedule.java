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
    public void getByDate(){
        Map<LocalDate, Schedule> getByDate = new TreeMap<>(toSchedule);
        System.out.println(getByDate);

    }


}
