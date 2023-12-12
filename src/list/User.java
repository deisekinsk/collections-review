package list;

import java.util.Comparator;

public class User implements Comparable<User>{

    private String name;
    private  int age;
    private double height;

    public User(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    //comparable
    @Override
    public int compareTo(User user) {
        return Integer.compare(age,user.getAge());
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }


    @Override
    public String toString() {
        return "\nUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
