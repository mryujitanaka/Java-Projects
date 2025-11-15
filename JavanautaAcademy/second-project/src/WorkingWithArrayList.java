// Working with Java Collections using Array List

import java.util.ArrayList;
import java.util.List;

public class WorkingWithArrayList {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("Eggs");
        shoppingList.add("Banana");
        shoppingList.add("Avocado");

        for (String shoppingListItem : shoppingList) {
            System.out.println(shoppingListItem);
        }

        // Add a new item on the list:
        shoppingList.add(1,"Salt");
        System.out.println();
        System.out.println("Second shopping list:");
        for (String shoppingListItem : shoppingList) {
            System.out.println(shoppingListItem);
        }

        // Check item's position in the list:
        String secondShoppingListItem = shoppingList.get(3);
        System.out.println();
        System.out.println("In position 3, the item on the list is: " + secondShoppingListItem);

        // Remove a specific item from the list:
        shoppingList.remove("Salt");
        System.out.println();
        System.out.println("Third shopping list:");
        for (String thirdShoppingListItem : shoppingList) {
            System.out.println(thirdShoppingListItem);
        }

        // Check if the list is empty:
        boolean isShoppingListEmpty = shoppingList.isEmpty();
        System.out.println();
        System.out.println("Is the shopping list empty? " + isShoppingListEmpty);

        // Check how many items are on the list:
        int shoppingListSize = shoppingList.size();
        System.out.println();
        System.out.println("The shopping list has " + shoppingListSize + " itens.");

        // Check if a specific item exists in the list:
        boolean doesThisItemExist = shoppingList.contains("Avocado");
        System.out.println();
        System.out.println("Is avocado an item on the shopping list? " + doesThisItemExist);

        // Iterating through the list using For-Each:
        System.out.println();
        shoppingList.forEach(productsOnTheShoppingList -> System.out.println(productsOnTheShoppingList));

        // Clear the list:
        shoppingList.clear();
        System.out.println();
        System.out.println("Is the shopping list empty? " + shoppingList.isEmpty());
    }
}