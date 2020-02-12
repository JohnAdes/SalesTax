package com.johnson;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingReceipt {

    static double allSale;
    static double allTax;
    static double allTotal;
    final static double TAX_RATE = 0.10;  // Sales Tax Rate CONSTANT
    final static double IMPORT_DUTY = 0.05;  // Import Duty Rate CONSTANT
    private double sale;
    private double tax;
    private double total;


    public ShoppingReceipt() {
    }

    public ShoppingReceipt(double sale, double tax, double total) {
        this.sale = sale;
        this.tax = tax;
        this.total = total;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }


    public static void listItems() {
        int numOfItems = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("How many different items are there your Shopping Cart?");
        numOfItems = input.nextInt();

        //display prompts, get input and store data
        ArrayList<Item> items = new ArrayList<>();
        for (int i = 0; i < numOfItems; i++) {
//            Scanner input = new Scanner(System.in);
            System.out.println("Item Description "); // prompt for Item description
            String itemDescription = input.nextLine();
            String itemName = input.nextLine(); // read & store item description
            System.out.println("Item quantity:  "); // prompt for quantity
            int quantity = input.nextInt();  // read & store item quantity
            System.out.println("Item price:  $"); // prompt for price
            double price = input.nextDouble();  // read & store item price
            System.out.print("What category is this item - Food/Book/Medical/Others?"); // prompt for category
            Category category = Category.valueOf(input.next()); // read & store item category
            System.out.println("Item Imported? ");  // prompt for question - if item is imported
            boolean importedItem = input.nextBoolean(); // read & store if item is imported

            items.add(new Item(quantity, itemName, price, category, importedItem));

        }
        //calculations
        for (Item item : items) {
            ShoppingReceipt salesTax = new ShoppingReceipt();
            salesTax.setSale(item.getPrice() * item.getQuantity());
            System.out.println(item.getPrice() + " " + item.getQuantity()); //test
            System.out.println(item.getCategory()); //test
            if (item.getCategory() != Category.Others) {
                salesTax.setTax((item.getPrice() * item.getQuantity()) + (0 + IMPORT_DUTY));

                if (item.isImportedItem()) {
                    salesTax.setTax((item.getPrice() * item.getQuantity()) * (TAX_RATE + IMPORT_DUTY));

                } else {
                    salesTax.setTax((item.getPrice() * item.getQuantity()) * IMPORT_DUTY);

                    salesTax.setTax((item.getPrice() * item.getQuantity()) * TAX_RATE);


                }
            }

            salesTax.setTotal(salesTax.getSale() + salesTax.getTax());
            item.setSalesTax(salesTax);

            //display items in the list
            System.out.printf("%d", item.getQuantity());
            System.out.printf("%s", item.getItemName());
            System.out.printf(":$%.2f\n", item.getSalesTax().getTotal());
            ;
            allSale += salesTax.getSale();
            allTax += salesTax.getTax();
            allTotal += salesTax.getTotal();
        }
        //display the result
        System.out.printf("Sales Taxes: %.2f\n", allTax);
        System.out.printf("Total: %.2f\n", allTotal);
    }

}
//
//1 imported bottle of perfume at 27.99
//        1 bottle of perfume at 18.99
//        1 packet of headache pills at 9.75
//        1 box of imported chocolates at 11.25
//
//
//        Output 3:
//        1 imported bottle of perfume: 32.19
//        1 bottle of perfume: 20.89
//        1 packet of headache pills: 9.75
//        1 imported box of chocolates: 11.85
//        Sales Taxes: 6.70
//        Total: 74.68