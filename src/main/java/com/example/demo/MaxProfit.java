package com.example.demo;

public class MaxProfit {

        public static int maxProfit(int price[], int n) {
            int profit[] = new int[n];

            int maxPrice = price[n - 1];

            // Maximum profit with one transaction from right side
            for (int i = n - 2; i >= 0; i--) {
                if (price[i] > maxPrice)
                    maxPrice = price[i];

                profit[i] = Math.max(profit[i + 1], maxPrice - price[i]);
            }

            int minPrice = price[0];

            // Maximum profit with two transactions
            for (int i = 1; i < n; i++) {
                if (price[i] < minPrice)
                    minPrice = price[i];

                profit[i] = Math.max(profit[i - 1], profit[i] + (price[i] - minPrice));
            }

            return profit[n - 1];
        }

        public static void main(String[] args) {
            int price[] = {10, 22, 5, 75, 65, 80};
            int n = price.length;

            System.out.println("Maximum Profit = " + maxProfit(price, n));
        }
    }

