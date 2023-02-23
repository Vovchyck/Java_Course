package com.Homework_11;

public class Main {
    public static void main(String[] args) {
        Car Bumblebee = new Car();
        Bumblebee.setModel("Chevrolet Camaro");
        Bumblebee.setColor("Yellow with black stripes");
        Bumblebee.setIsElectric(false); //he works on true energon!
        System.out.println(Bumblebee.getModel() + " " + Bumblebee.getColor());

        Truck OptimusPrime = new Truck();
        OptimusPrime.setModel("Western Star 5700XE");
        OptimusPrime.setColor("Blue with red fire print");
        OptimusPrime.setHasTrailer(true); //portable armory!
        System.out.println(OptimusPrime.getModel() + " " + OptimusPrime.getColor());
    }
}