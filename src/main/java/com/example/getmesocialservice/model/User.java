package com.example.getmesocialservice.model;

public class User {

    private String name, address, profilePicUrl;
    private int age;

    public User(String name, String address, String profilePicUrl, int age) {
        this.name = name;
        this.address = address;
        this.profilePicUrl = profilePicUrl;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
