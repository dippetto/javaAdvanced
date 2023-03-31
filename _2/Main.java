package _2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Follow the steps below
     */
    private static void exercise1() {
        // 1a. Create a map of integers to strings
        Map<Integer, String> myFirstMap = new HashMap<>();
        myFirstMap.put(12, "Robb");
        myFirstMap.put(7, "Carl");
        myFirstMap.put(2, "Ciao");
        // 1b. Add 3 elements to the map .put
        System.out.println(myFirstMap);
        // 1c. Print the map
        if (myFirstMap.get(12).equals("Robb")) {
            System.out.println("Test");
        }
        // 1d. Access an element in the map with .get
        myFirstMap.remove(7);
        // 1e. Remove an element from the map .remove
        System.out.println(myFirstMap);
        // 1f. Print the map again to confirm the element was removed
    }

    /**
     * 2: Follow the instructions in the code
     */
    private static void exercise2() {
        Map<String, Double> menuCostsInEuro = new HashMap<>();

        menuCostsInEuro.put("Fries", 3.50);
        menuCostsInEuro.put("Pizza", 11.80);
        menuCostsInEuro.put("Burger", 8.50);
        double max = Integer.MIN_VALUE;

        String mostExpensiveMenuItemName = null;

        // 2a. Loop over the map entries with menuCostsInEuro.entrySet()
        //     and set out the most expensive items name
        //     use for(Map.Entry<String, Double> entry : menuCostsInEuro.entrySet()) and entry.getKey and entry.getValue
        //     to do so
        for (Map.Entry<String, Double> entry : menuCostsInEuro.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                mostExpensiveMenuItemName = entry.getKey();
            }

        }


        if (mostExpensiveMenuItemName.equals("Pizza")) {
            System.out.println("2a. Correct!");
        } else {
            System.out.println("2a. Incorrect!");
        }
    }

    /**
     * 3: Follow the instructions in the code
     */
    private static void exercise3() {
        Map<String, Integer> fruitWeights = new HashMap<>();

        fruitWeights.put("Apple", 5);
        fruitWeights.put("Banana", 3);
        fruitWeights.put("Orange", 8);
        fruitWeights.put("Kiwi", 1);
        fruitWeights.put("Mango", 4);
        fruitWeights.put("Grapes", 8);
        fruitWeights.put("Peach", 5);
        fruitWeights.put("Pineapple", 1);

        int totalWeight = 0;
        // 3a. Use a for loop with fruitWeights.values() and sum up the total weight
        for (Map.Entry<String, Integer> fruit : fruitWeights.entrySet()) {
            totalWeight += fruit.getValue();
        }


        if (totalWeight == fruitWeights.values().stream().mapToInt(Integer::intValue).sum()) {
            System.out.println("3. Correct!");
        } else {
            System.out.println("3. Incorrect!");
        }
    }
}
