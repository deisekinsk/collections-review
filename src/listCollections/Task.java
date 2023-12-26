//basicOperations

package listCollections;
public class Task {

    private final String description;

    public Task(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
       return String.format("📙 %s\n ", description );
    }
}
