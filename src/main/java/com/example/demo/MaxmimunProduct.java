package com.example.demo;

public class MaxmimunProduct {
    public static void main(String args[]) {
        int[] n = {2, 4, 1, 5};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                int p = n[i] * n[j];
                if (max < p) {
                    max = p;
                }
            }
        }

        System.out.println(max);
    }
}