package com.techelevator;

public class Exercise01_StoreOrders {

    /*
    Sally's Pizza is bringing its pizza ordering system into the digital age
    to get better customer insights.

    They've encoded each of Sally's pizzas and other dishes as an integer:
	 * 10: small, cheese       20: medium, cheese       30: large, cheese
	 * 11: small, pepperoni    21: medium, pepperoni    31: large, pepperoni
	 * ---
	 * 40: calzone
	 * 41: spaghetti pie
	 * 42: baked ziti
     */

    // You can use these constants in your solutions.
    private final int SMALL_CHEESE = 10;
    private final int SMALL_PEPPERONI = 11;

    private final int MEDIUM_CHEESE = 20;
    private final int MEDIUM_PEPPERONI = 21;

    private final int LARGE_CHEESE = 30;
    private final int LARGE_PEPPERONI = 31;

    private final int CALZONE = 40;
    private final int SPAGHETTI_PIE = 41;
    private final int BAKED_ZITI = 42;

    /*
    Each customer order, consisting of one or more pizzas, is represented as an array
    where each value represents an item in that order.

    Create an "order" that contains the following items:
	 * - small, cheese (SMALL_CHEESE) =
	 * - calzone (CALZONE) = 40
	 * - large, pepperoni (LARGE_PEPPERONI) = 31
	 * - spaghetti pie (SPAGHETTI_PIE) = 41

	 Examples:
	 createOrder() → [10, 40, 31, 41]
     */
    public int[] createOrder() {

        int[] orders = {10, 40, 31, 41};
        return orders;
    }

    /*
    Sally realized that she needed to know how many calzones her shop sells per day.

    Implement the logic to count the number of calzones sold per day when given an
    array representing each item that her customers ordered that day.

    *
    how many calzones; calzone = 40
    count calzones; variable that holds the count number
    we are given an array
    *

    Examples:
    getCalzoneSales([40, 30, 31, 40, 10]) → 2
    getCalzoneSales([30, 31, 10]) → 0
    getCalzoneSales([]) → 0
     */
    public int getCalzoneSales(int[] orders) {
        int calzones = 0;

        for (int i = 0; i < orders.length; i++) {

            int orderItem = orders[i];

            if (orderItem == 40) {
                calzones++;
            }

        }
        return calzones;
    }

    /*

    Sally also needs to know the total revenue for all cheese pizzas sold on any given day.
        * Each small cheese pizza costs $8.
        * Each medium cheese pizza costs $11.
        * Each large cheese pizza costs $14.

    Implement the logic to return the total revenue of all cheese pizzas when given
    an array representing each item that her customers ordered that day.

    Examples:
    getCheesePizzaRevenue([10]) → 8
    getCheesePizzaRevenue([10, 11, 20]) → 19
    getCheesePizzaRevenue([11, 21]) → 0
     */
    public int getCheesePizzaRevenue(int[] orders) {
        // total of all s, m, l cheese pizzas

        int smallCheese = 0;
        int mediumCheese = 0;
        int largeCheese = 0;
        //
        for (int orderItem : orders) {
            if (orderItem == SMALL_CHEESE) {
                smallCheese++;
            } else if (orderItem == MEDIUM_CHEESE) {
                mediumCheese++;
            } else if (orderItem == LARGE_CHEESE) {
                largeCheese++;
            }
        }
        // small cheese x the price which is 8 + medium cheese and so on ..
        return smallCheese * 8 + mediumCheese * 11 + largeCheese * 14;

    }


}
