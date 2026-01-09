package com.example.mypetshop;
import java.util.Date;
public class Scorpion extends Pet{
    public Scorpion(String name) {
        super(name);
    }
    public Scorpion(String name, Date birthDate) {
        super(name, birthDate);
    }
    @Override
    public String speak() {
        return "hiss";
    }
}
