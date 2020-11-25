package com.company;

import com.company.GroceryList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
//        ArrayList<String> gg = Main.groceryList.getGroceryList();
//        gg.add("dipa");
        ArrayList<String> list1 = Main.groceryList.getGroceryList();
        ArrayList<String> list2 = Main.groceryList.getGroceryList();
        ArrayList<String> list3 = Main.groceryList.getGroceryList();
        ArrayList<String> list4 = Main.groceryList.getGroceryList();
        list1.add("dupa");


        Main.groceryList.printGroceryList();
        groceryList.printGroceryList();
        boolean quit = false;
        int choice = 0;
        printInstruction();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    Main.groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstruction() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To application");
        System.out.println("\t 7 - To quit application");
    }

    public static void addItem() {
        System.out.print("Please add the grocery item ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter item name: ");
        String itemNo = scanner.nextLine();
        System.out.print("Enter replacement item ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item name: ");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem() {
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " on grocery list.");
        } else {
            System.out.println(searchItem + " is not in the shoppin list.");
        }
    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }

}


