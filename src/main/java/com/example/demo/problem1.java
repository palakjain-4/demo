
package com.example.demo;
import java.util.*;
public class problem1 {
        public static void main(String[] args) {
            int target = 12;
            int[] n = {8, 2, 10, 15, 4, 3};
            for (int i = 0; i < n.length; i++) {
                for (int j = i + 1; j < n.length; j++) {
                    if (n[i] + n[j] == target) {
                        System.out.println("(" + n[i] + ", " + n[j] + ")");
                    }
                }
            }
        }
    }

