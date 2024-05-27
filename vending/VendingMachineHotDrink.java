package ru.gb.vending_machine.vending;

import java.util.ArrayList;
import java.util.List;

import ru.gb.vending_machine.products.Product;

/**
 * VendingMachineHotDrink
 */
public class VendingMachineHotDrink extends VendingMachine {

    private int id;
    private int productId;
    private List<Product> productList;

    public VendingMachineHotDrink(int id) {
        super(id);
        productList = new ArrayList<>();
    }

    public void addDrink(Product product){
        product.setId(productId++);
        productList.add(product);
    }

    public String getProductsInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Напитки   :\n");
        for (Product product: productList){
            stringBuilder.append(product);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    
}