package com.vitelco.training.model;

public class Car {

    //state
    public String color;
    public String model;
    public int year;

    // behavior : method
    public void drive(int speed){ //kodun yazarken (speed:200) parametre
        System.out.println(this.toString() + " is running in "
                        + speed + " speed limit.");
    }

    public void start(){
        System.out.println(this.toString() + " is started");
    }

    public void stop(){
        System.out.println(this.toString() + " is stopped");
    }

    @Override
    public String toString() {
        return "Car[" +
                "color='" + color +
                ", model='" + model +
                ", year=" + year +
                ']';
    }
}
