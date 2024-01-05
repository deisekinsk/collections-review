package mapCollections;

public class Schedule {
    private String event;
    private String band;

    public Schedule(String event, String band) {
        this.event = event;
        this.band = band;
    }

    public String getEvent() {
        return event;
    }

    public String getBand() {
        return band;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "event='" + event + '\'' +
                ", band='" + band + '\''+"\n" +
                '}';
    }
}
