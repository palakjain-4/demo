package com.example.demo;
public class MoveNegative {
        public static void main(String[] args) {
            int[] arr = { -4,6,-2,-1,67,89};

            int left = 0, right = arr.length - 1;

            while (left <= right) {
                if (arr[left] < 0) {
                    left++;

                } else if (arr[right] >= 0) {
                    right--;
                } else {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
            }

            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }

