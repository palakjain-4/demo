package com.example.demo;

public class problem3 {

    static void rotateMatrix(int[][] arr) {
        int n = arr.length;

        // Step 1: Transpose
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n/2; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][n-1-j];
                arr[i][n-1-j] = temp;
            }
        }
    }

    static void print(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] arr = {
                {6,4,3},
                {6,7,6},
                {1,2,5}
        };

        System.out.println("Original Matrix:");
        print(arr);

        rotateMatrix(arr);

        System.out.println("After Rotation:");
        print(arr);
    }
}