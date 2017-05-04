package com.appexample.mygflist;


public class MyList {

    public String Name, Age, Nationality, Description;
    public int img_id;

    public MyList(String Name, String Age, String Nationality, int img_id, String Description) {
        this.Name = Name;
        this.Age = Age;
        this.Nationality = Nationality;
        this.img_id = img_id;
        this.Description = Description;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public String getDescription(){

        return Description;
    }

    public void setDescription (String description ){

        Description = description;
    }
}
