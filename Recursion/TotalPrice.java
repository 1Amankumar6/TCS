package TCS.Recursion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();  // Number of items

        Map<String, Double> store = new HashMap<>();
        double totalPrice = 0;
        String maxCostItem = "";
        double maxCost = 0;

        // Process each item, its quantity and price
        for (int i = 0; i < n; i++) {
            String item = s.next();  // Item name
            int quantity = s.nextInt();  // Quantity of the item
            int price = s.nextInt();  // Price of one unit of the item

            // Calculate the total price for this item and add to the total
            double itemTotalPrice = quantity * price;
            totalPrice += itemTotalPrice;

            // If this item has the highest cost, update maxCost and maxCostItem
            if (itemTotalPrice > maxCost) {
                maxCost = itemTotalPrice;
                maxCostItem = item;
            }

            // Store the total cost of the item in the map
            store.put(item, store.getOrDefault(item, 0.0) + itemTotalPrice);
        }

        // Calculate the average price (total price divided by number of items)
        double avg = totalPrice / n;

        // Print the results
        System.out.printf("\nTask 2 - Item: %s\nTotal price: %.2f\nAverage Price: %.2f\n", maxCostItem, totalPrice, avg);

        s.close();
    }
}
