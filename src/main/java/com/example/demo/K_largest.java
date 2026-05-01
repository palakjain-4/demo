package com.example.demo;

import java.util.Arrays;
import java.util.Collections;

public class K_largest {
    public static void main(String args[])
    {
        Integer[] n = {10,20,34,56,555,32};
        int k = 2;

        Arrays.sort(n, Collections.reverseOrder());

        System.out.println("Kth largest element: " + n[k - 1]);
    }

}
