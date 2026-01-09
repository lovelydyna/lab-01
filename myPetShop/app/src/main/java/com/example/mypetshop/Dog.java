package com.example.mypetshop;
import java.util.Date;
public class Dog extends Pet implements Pettable {
    public Dog(String name) {
        super(name);
    }
    public Dog(String name, Date birthDate) {
        super(name, birthDate);
    }
    @Override
    public String speak() {
        return "bark";
    }
    @Override
    public void pet() {
        System.out.println("Dog wags tails");
    }
}
