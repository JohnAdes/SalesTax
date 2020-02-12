package com.johnson;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

import static com.johnson.ShoppingReceipt.listItems;

public class Main {



    public static void main(String[] args) {
        listItems();
    }

//    public static void listItems() {
//        int numOfItems = 0;
//        Scanner input = new Scanner(System.in);
//        System.out.println("How many different items are there your Shopping Cart?");
//        numOfItems = input.nextInt();
//
//        //display prompts, get input and store data
//        ArrayList<Item> items = new ArrayList<>();
//        for (int i = 0; i < numOfItems; i++) {
////            Scanner input = new Scanner(System.in);
//            System.out.println("Item Description "); // prompt for Item description
//            String itemDescription = input.nextLine();
//            String itemName = input.nextLine(); // read & store item description
//            System.out.println("Item quantity:  "); // prompt for quantity
//            int quantity = input.nextInt();  // read & store item quantity
//            System.out.println("Item price:  $"); // prompt for price
//            double price = input.nextDouble();  // read & store item price
//            System.out.print("What category is this item - Food/Book/Medical/Others?"); // prompt for category
//            Category category = Category.valueOf(input.next()); // read & store item category
//            System.out.println("Item Imported? ");  // prompt for question - if item is imported
//            boolean importedItem = input.nextBoolean(); // read & store if item is imported
//
//            items.add(new Item(quantity, itemName, price, category, importedItem));
//
//        }
//        //calculations
//
//
//            for (int i = 0; i < items.size(); i++) {
//                Item item = items.get(i);
//                ShoppingReceipt salesTax = new ShoppingReceipt();
//                salesTax.setSale(item.getPrice() * item.getQuantity());
//                if (item.getCategory() == Category.Others) {
//                    salesTax.setTax((item.getPrice() * item.getQuantity()) + (0 * (TAX_RATE)));
//
//
//                    if (item.isImportedItem()) {
//                        salesTax.setTax((item.getPrice() * item.getQuantity()) * (TAX_RATE + IMPORT_DUTY));
//
//                    } else {
//                        salesTax.setTax((item.getPrice() * item.getQuantity()) * IMPORT_DUTY);
//
//                        salesTax.setTax((item.getPrice() * item.getQuantity()) * TAX_RATE);
//                    }
//
//                }
//
//                if (item.getCategory() != Category.Others) {
//                    salesTax.setTax((item.getPrice() * item.getQuantity()));
//
//
//                    if (item.isImportedItem()) {
//                        salesTax.setTax((item.getPrice() * item.getQuantity()) * ( IMPORT_DUTY));
//
//                    } else {
//                        salesTax.setTax((item.getPrice() * item.getQuantity()));
//
//                    }
//                }
//
//                salesTax.setTotal(salesTax.getSale() + salesTax.getTax());
//                item.setSalesTax(salesTax);
//
//                //display items in the list
//                System.out.printf(" %d",item.getQuantity());
//                System.out.printf(" %s",item.getItemName());
//                System.out.printf(" :$%.2f" + item.getSalesTax().getTotal());;
//                allSale += salesTax.getSale();
//                allTax += salesTax.getTax();
//                allTotal += salesTax.getTotal();
//            }
//            //display the result
//            System.out.printf("Sales Taxes: %.2f\n", allTax);
//            System.out.printf("Total: %.2f\n", allTotal);
//        }


}

// $%.2f!
// 1 book at 12.49
//1 music CD at 14.99
//1 chocolate bar at 0.85

//1 book : 12.49
//        1 music CD: 16.49
//        1 chocolate bar: 0.85
//        Sales Taxes: 1.50
//        Total: 29.83