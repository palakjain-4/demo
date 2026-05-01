package com.example.demo;

import java.util.Arrays;

public class Rearangesign {

    public static void rearrange(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            if ((i % 2 == 0 && arr[i] < 0) || (i % 2 == 1 && arr[i] >= 0)) {
                for (int j = i + 1; j < n; j++) {

                    if ((i % 2 == 0 && arr[j] >= 0) || (i % 2 == 1 && arr[j] < 0)) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] n = {-1, -2, 1, 2};

        rearrange(n);

        System.out.println(Arrays.toString(n));
    }
}