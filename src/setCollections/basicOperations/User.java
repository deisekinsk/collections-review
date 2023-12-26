package setCollections.basicOperations;

import java.util.Objects;

public class User {

    private String userName;
    private int passUser;

    public User(String userName, int passUser) {
        this.userName = userName;
        this.passUser = passUser;
    }

    public String getUserName(){
        return userName;
    }
    public int getPassUser() {
        return passUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return getPassUser() == user.getPassUser();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPassUser());
    }

    @Override
    public String toString() {
        return "\nUser{" +
                "userName='" + userName + '\'' +
                ", passUser=" + passUser +
                '}';
    }
}
