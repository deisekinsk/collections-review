package setCollections.basicOperations;

import java.util.HashSet;
import java.util.Set;

public class UserSet {

    private Set<User> userSet;

    public UserSet(){
        this.userSet = new HashSet<>();
    }

    public void addUserSet(String userName, int userPass) {
        userSet.add(new User(userName, userPass));
    }

    public void removeUserSet(int userPass){
        User removeUserSet = null;
        for(User i : userSet){
            if(i.getPassUser() == userPass){
                removeUserSet = i;
                break;
            }
        }
        userSet.remove(removeUserSet);
    }
//convert method toArray
//    public void removeUserSet(int userPass) {
//        User removeUserSet = null;
//        User[] userArray = userSet.toArray(new User[0]);
//        for (int i = 0; i < userArray.length; i++) {
//            if (userArray[i].getPassUser() == userPass) {
//                removeUserSet = userArray[i];
//                break;
//            }
//        }
//        if (removeUserSet != null) {
//            userSet.remove(removeUserSet);
//        }
//    }

    public int countUserSet(){
        return userSet.size();
    }

    public void printUserSet(){
        System.out.println(userSet);
    }



}
