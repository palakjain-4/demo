package com.example.demo;

import java.util.HashSet;

public class RemoveDublicate {
    public static void main(String args[])
    {
        int arr[]={10,32,10,34,343};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                System.out.println("Duplicate: " + num);
                break;
            }
            set.add(num);
    }}
}
