package com.singlylinkedlist.inventorymanagementsystem;

public class ItemSinglyFunctionalities {
    private ItemNode head;

    //Adding at the beginning
    public void addAtBeginning(String itemName, int itemId, int quantity, double price){
       ItemNode newNode = new ItemNode(itemName, itemId, quantity, price);
          newNode.next = head;
          head = newNode;
          return;
    }

    //Adding at the End
    public void addAtEnd(String itemName, int itemId, int quantity, double price){
        ItemNode newNode = new ItemNode(itemName, itemId, quantity, price);

        ItemNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    //Adding at the Specific Position
    public void addAtSpecificPosition(String itemName, int itemId, int quantity, double price,int position){
        ItemNode newNode = new ItemNode(itemName, itemId, quantity, price);

        if(position < 0){
            System.out.println("Invalid Position!");
            return;
        }
        if(position == 0){
           addAtBeginning(itemName, itemId, quantity, price);
            return;
        }
        ItemNode temp = head;
     for(int i=0; temp.next != null && i<position-1; i++){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Out of Bounds!");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //deleting a ItemNode
    public void deleteNode(int itemId){
        if(head == null){
            System.out.println("Item List is already empty!");
            return;
        }
        if(head.itemId == itemId){
            head = head.next;
        }

        ItemNode temp = head;
        while(temp.next != null && temp.next.itemId != itemId){
            temp = temp.next;
        }
        if(temp.next==null){
            System.out.println("Student with roll Number " + head.itemId + ", not found.");
            return;
        }
        temp.next = temp.next.next;
        System.out.println("Student with roll Number " + itemId + " is is deleted.");
    }

    //Updating a node
    public void updateNode(int itemId, int quantity){
        if (head == null) {
            System.out.println(" Record is Empty");
        }

        ItemNode temp = head;
        while(temp != null){
            if(temp.itemId == itemId){
                temp.quantity = quantity;
                return;
            }
            temp = temp.next;
        }

    }

    //Searching a ItemNode by item Id
    public void searchBYItemId(int itemId){
        if(head == null){
            System.out.println("Item List is Empty");
            return;
        }
        ItemNode temp = head;
        while(temp.next != null ){
            if(temp.itemId == itemId){
                System.out.println("--------Item Found ------");
                System.out.println("Item Name       : "+temp.itemName);
                System.out.println("ItemId          : "+temp.itemId);
                System.out.println("Item Quantity   : "+temp.quantity);
                System.out.println("Item Price      : "+temp.price);
                return;
            }
            temp = temp.next;
        }
        if(temp == null){
            System.out.print("Item not found!");
            return;
        }
    }

    //searching a node by ItemName
    public void searchBYItemName(String itemName){
        if(head == null){
            System.out.println("Item List is Empty");
            return;
        }
        ItemNode temp = head;
        while(temp.next != null ){
            if(temp.itemName.equals(itemName)){
                System.out.println("--------Item Found ------");
                System.out.println("Item Name       : "+temp.itemName);
                System.out.println("ItemId          : "+temp.itemId);
                System.out.println("Item Quantity   : "+temp.quantity);
                System.out.println("Item Price      : "+temp.price);
                return;
            }
            temp = temp.next;
        }

            System.out.print("Item not found!");
            return;

    }

    //calculating and displaying the total value of inventory
    public void calculateValue(){
        double totalValue = 0;
        if(head == null){
            System.out.println("Item List is Empty");
            return;
        }
        ItemNode temp = head;
        while(temp != null){
            totalValue += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println("The Total value of Inventory is "+totalValue);
    }

    //displaying the itemNode
    public void displayItem(){
        if(head == null){
            System.out.println("Item List is Empty");
            return;
        }
        ItemNode temp = head;
        while(temp != null){
            System.out.println("--------Item Found ------");
            System.out.println("Item Name       : "+temp.itemName);
            System.out.println("ItemId          : "+temp.itemId);
            System.out.println("Item Quantity   : "+temp.quantity);
            System.out.println("Item Price      : "+temp.price);
            temp = temp.next;
           // return;
        }
    }
    // Sort the inventory by Item Name or Price
    public void sort(String by) {
        head = mergeSort(head, by);
        System.out.println("Inventory sorted by " + (by.equals("name") ? "Item Name." : "Price."));
    }

    private ItemNode mergeSort(ItemNode head, String by) {
        if (head == null || head.next == null) {
            return head;
        }

        ItemNode mid = getMiddle(head);
        ItemNode nextOfMid = mid.next;
        mid.next = null;

        ItemNode left = mergeSort(head, by);
        ItemNode right = mergeSort(nextOfMid, by);

        return merge(left, right, by);
    }

    private ItemNode getMiddle(ItemNode head) {
        if (head == null) return head;
        ItemNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ItemNode merge(ItemNode left, ItemNode right, String by) {
        if (left == null) return right;
        if (right == null) return left;

        ItemNode result;
        if (by.equals("name")) {
            if (left.itemName.compareToIgnoreCase(right.itemName) <= 0) {
                result = left;
                result.next = merge(left.next, right, by);
            } else {
                result = right;
                result.next = merge(left, right.next, by);
            }
        } else {
            if (left.price <= right.price) {
                result = left;
                result.next = merge(left.next, right, by);
            } else {
                result = right;
                result.next = merge(left, right.next, by);
            }
        }
        return result;
    }

}
