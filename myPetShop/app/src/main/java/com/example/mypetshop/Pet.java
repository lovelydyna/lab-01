package com.example.mypetshop;
import java.util.Date;

public abstract class Pet {
    //attributes: name and birthdate
    private String name;
    private Date birthDate;

    //constructors for Pet: (1) name only, (2) name and birthdate
    public Pet(String name) {
        this.name = name;
        this.birthDate = new Date(); // current date (default data value)
    }
    public Pet(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate; // custom date
    }

    //Getter
    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public abstract String speak();
}
