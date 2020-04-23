import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstruction();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();



            switch(choice){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryList();
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

    public static void printInstruction(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to your grocery list.");
        System.out.println("\t 3 - To modify an item in your grocery list.");
        System.out.println("\t 4 - To remove an item from your grocery list.");
        System.out.println("\t 5 - To search your grocery list before you check out");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem(){
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());

    }

    public static void modifyItem(){
        System.out.print("Enter item number: ");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.updateGroceryItem(itemNumber-1, newItem);
    }

    public static void removeItem(){
        System.out.print("Enter item number: ");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNumber-1);

    }

    public static void searchForItem(){
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem + " in our grocery list");
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }

    }


//    private static Scanner scanner = new Scanner(System.in);
//    private static int[] baseData = new int[10];
//
//    public static void main(String[] args) {
//        System.out.println("Enter 10 integers:");
//        getInput();
//        // printArray(baseData);
//        // resizedArray();
//        System.out.println("Enter 12 integers:");
//        getInput();
//        // printArray(baseData);
//
//    }
//
//    private static void getInput() {
//        for (int i = 0; i < baseData.length; i++) {
//            baseData[i] = scanner.nextInt();
//        }
//
//    }
//
//    private static void printArray(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//            System.out.println();
//        }
//    }
//
//    private static void resizedArray() {
//        int[] original = baseData;
//        baseData = new int[12];
//        for (int i = 0; i < original.length; i++) {
//            baseData[i] = original[i];
//        }
//    }


}


