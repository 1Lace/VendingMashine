package ru.gb.vending_machine.products;

import javax.print.DocFlavor.STRING;

public class HotDrink extends Product {

    private double temp;
    private double volume;

    public HotDrink(String name, double price, double volume, double temp) {
        super(name, price);
        this.volume = volume;
        this.temp = temp;
    }

    public double getVolume() {
        return volume;
        
    }

    public double getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        return super.toString() + ", volume: " + volume + "л., " + "temperature : " + temp;
    }
    
}