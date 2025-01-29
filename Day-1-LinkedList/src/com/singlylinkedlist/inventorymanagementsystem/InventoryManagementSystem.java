package com.singlylinkedlist.inventorymanagementsystem;

public class InventoryManagementSystem {
    public static void main(String[] args){
        ItemSinglyFunctionalities item = new ItemSinglyFunctionalities();

        System.out.println("Adding the items at the beginning");
        item.addAtBeginning("Coffee",201,10,5.0);
        item.addAtBeginning("Tea",202,10,3.0);
        item.displayItem();
        item.addAtBeginning("Green Tea",203,10,9.0);
        item.displayItem();

        System.out.println("Adding the items at the End");
        System.out.println("Adding bread at end");
        item.addAtEnd("bread",204,8,20.0);
        item.displayItem();

        System.out.println("Adding the items at the specific position");
        System.out.println("Adding toast at 1");
        item.addAtSpecificPosition("toast",205,5,25.0,1);
        item.displayItem();

        System.out.println("Deleting items by itemid - 203");
        item.deleteNode(203);
        item.displayItem();

        System.out.println("Searching the item by itemid");
        item.searchBYItemId(202);
        System.out.println("Searching the item by itemName");
        item.searchBYItemName("Tea");

        System.out.println("\nCalculating total inventory value and display");
        item.calculateValue();

        System.out.println("\nSorting inventory by Name:");
        item.sort("name");
        item.displayItem();

        System.out.println("\nSorting inventory by price:");
        item.sort("price");
        item.displayItem();

    }
}
