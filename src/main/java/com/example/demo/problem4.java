package com.example.demo;

public class problem4 {
    public static void main(String args[]) {
        int n[]={3, 5, 4, 1, 9};
        int min=n[0];
        int max=n[0];
        for(int i=0;i<n.length;i++)
        {
           if(min>n[i])
           {
               min=n[i];
           }
           if(max<n[i])
           {
               max=n[i];
           }
        }
        System.out.println("min of array"+min);
        System.out.println("max of array"+max);
    }
    }