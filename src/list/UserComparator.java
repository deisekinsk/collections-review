package list;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {

    @Override
    public int compare(User user1, User user2) {
        return Double.compare(user1.getHeight(), user2.getHeight());
    }
}
