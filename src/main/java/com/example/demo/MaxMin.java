package com.example.demo;

public class MaxMin
{
    public static void main(String args[])
    {

        int n[]={10,20,40,54,1};
        int max = n[0];
        int min = n[0];
        for (int i=0;i<n.length;i++)
        {
            if(n[i]>max) {
                max = n[i];

            }
            else if (n[i]<min)
            {
                min=n[i];
            }

        }
        System.out.println(max);
        System.out.println(min);
    }
}
