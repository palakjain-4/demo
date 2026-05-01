package com.example.demo;

public class CountInversion {
    public static void main(String args[])
    {
        int [] n={2,4,1,3,5};
        int count=0;
        for(int i=0;i<n.length;i++)
        {
            for(int j=i+1;j<n.length;j++)
            {
                if(n[i]>n[j])
                {
                   count++;
                }
            }
        }
        System.out.println(count);
    }
}
