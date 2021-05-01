package com.company;

public class Course {
    String name;
    int created;
    int id;
    String bio;

    public void setName(String name){
        this.name = name;
    }
    public void setCreated(int created){
        if (created <= 0){
            System.out.println("Error");
        }else this.created = created;
    }
    public void setId(int id){
        if (id <= 0){
            System.out.println("Error");
        }else this.id = id;
    }
    public void setBio(String bio){
        this.bio = bio;
    }

    public String getName(){
        return name;
    }
    public int getCreated(){
        return created;
    }
    public int getId(){
        return id;
    }
    public String getBio(){
        return bio;
    }
}
