package com.example.demo;
import java.util.*;
public class tripletsum {


        // Function to find triplet with given sum
        static boolean findTriplet(int arr[], int n, int sum) {
            Arrays.sort(arr); // Sort array

            for (int i = 0; i < n - 2; i++) {
                int left = i + 1;
                int right = n - 1;

                while (left < right) {
                    int currentSum = arr[i] + arr[left] + arr[right];

                    if (currentSum == sum) {
                        System.out.println("Triplet is: " + arr[i] + ", " + arr[left] + ", " + arr[right]);
                        return true;
                    }
                    else if (currentSum < sum) {
                        left++;
                    }
                    else {
                        right--;
                    }
                }
            }
            return false;
        }

        public static void main(String[] args) {
            int arr[] = {1, 4, 45, 6, 10, 8};
            int sum = 22;
            int n = arr.length;

            if (!findTriplet(arr, n, sum)) {
                System.out.println("No Triplet Found");
            }
        }
    }