package list;

import java.util.*;

public class UserList {

    private List<User> userList;

    public UserList() {
        this.userList = new ArrayList<>();
    }

    public  void addUserList(String name, int age, double height){
        User user = new User(name, age, height);
        userList.add(user);
    }

    public List<User> getUserByAge(){
        //get the existed list
        List<User> userAge = new ArrayList<>(userList);
        Collections.sort(userAge);
        return userAge;
    }


    public List<User> getByHeight(){
        List<User> userHeight = new ArrayList<>(userList);
        //UserComparator userComparator = new UserComparator();
        Collections.sort(userList, new UserComparator());
        return userHeight;

    }
}
