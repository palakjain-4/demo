package com.example.demo;

public class stockprice {
    public static void main(String[] args)
    {
        int min=Integer.MAX_VALUE;
        int max=0;
        int [] n={7, 1, 5, 3, 6, 4};

        for(int i=0;i<n.length;i++)
        {
            if(n[i]<min)
            {
                min=n[i];
            }
            int profit= n[i]-min;
            if(profit>max)
            {
                max=n[i];

            }
        }
        System.out.println(max);

    }
}
