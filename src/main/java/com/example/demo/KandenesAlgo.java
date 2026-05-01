package com.example.demo;

public class KandenesAlgo {
    public static void main(String args[])
    {
        int []n={8,7,9,-1,6};

        int r=n[0];
        for(int i=0;i<n.length;i++)
        {
            int sum=0;
            for(int j=i;j<n.length;j++) {
                sum += n[j];
                r = Math.max(r, sum);
            }
        }
        System.out.println(r);
    }
}