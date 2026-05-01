package com.example.demo;
import java.util.*;
public class Elementfind {
        public static void findElements(int arr[], int n, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();

            // Count frequencies
            for (int i = 0; i < n; i++) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }

            // Check elements appearing more than n/k times
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > n / k) {
                    System.out.print(entry.getKey() + " ");
                }
            }
        }

        public static void main(String[] args) {
            int arr[] = {3, 1, 2, 2, 1, 2, 3, 3};
            int n = arr.length;
            int k = 4;

            findElements(arr, n, k);
        }
    }

