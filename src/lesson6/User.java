package lesson6;

import java.util.Date;

public class User {
    String name;
    int age;
    String city;
    Date lastActiveDate;
    boolean isActive;

    public User() {
    }

    public User(String name, int age, String ctiy, Date lastActiveDate, boolean isActive) {
        this.name = name;
        this.age = age;
        this.city = ctiy;
        this.lastActiveDate = lastActiveDate;
        this.isActive = isActive;
    }

    public User(String name) {
        this.name = name;
    }

    void logIn() {
        this.lastActiveDate = new Date();
    }

    void isActive(boolean status) {
        this.isActive = status;
    }

    void increaseAge() {
        this.age++;
    }
}
