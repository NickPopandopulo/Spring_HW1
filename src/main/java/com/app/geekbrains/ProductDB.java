package com.app.geekbrains;

import java.util.ArrayList;
import java.util.List;

public class ProductDB {
    private static List<Product> catalog = new ArrayList<>();

    static {
        catalog.add(new Product("T-shirt", 30.65));
        catalog.add(new Product("Hat", 10.20));
        catalog.add(new Product("Socks", 5.35));
        catalog.add(new Product("Chain", 150.40));
        catalog.add(new Product("Jeans", 40.00));
        catalog.add(new Product("Boots", 50.75));
        catalog.add(new Product("Gloves", 30.00));
        catalog.add(new Product("Coat", 150.65));
        catalog.add(new Product("Glasses", 30.55));
        catalog.add(new Product("Pants", 50.55));
    }

    public static List<Product> getCatalog() {
        return catalog;
    }
}
