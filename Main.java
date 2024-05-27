package ru.gb.vending_machine;

import ru.gb.vending_machine.products.Bottle;
import ru.gb.vending_machine.products.HotDrink;
import ru.gb.vending_machine.products.Product;
import ru.gb.vending_machine.vending.VendingMachine;
import ru.gb.vending_machine.vending.VendingMachineHotDrink;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(123);
        VendingMachineHotDrink vendingMachineHotDrink = new VendingMachineHotDrink(321);

        Product product1 = new Bottle("coca-cola", 150, 1.5);
        Product product2 = new Product("milko", 100);
        Product product3 = new HotDrink("Coffe", 100, 0.2, 70);
        Product product4 = new HotDrink("Чай", 50, 0.1, 80);

        
        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);
        vendingMachineHotDrink.addDrink(product3);
        vendingMachineHotDrink.addDrink(product4);
        
    

        System.out.println(vendingMachine.getProductsInfo());
        System.out.println(vendingMachineHotDrink.getProductsInfo());
    }
}
