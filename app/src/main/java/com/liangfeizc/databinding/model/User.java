package com.liangfeizc.databinding.model;

import android.databinding.ObservableField;

/**
 * Created by liangfeizc on 6/2/15.
 */
public class User {
    private final String firstName;
    private final String lastName;
//    private String displayName;
    public final ObservableField<String> displayName = new ObservableField<>();

    private int age;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(String firstName, String lastName, int age) {
        this(firstName, lastName);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

//    public String getDisplayName() {
//        return firstName + " " + lastName;
//    }

    public boolean isAdult() {
        return age >= 18;
    }


    public void setAge(int age) {
        this.age = age;
    }
}
