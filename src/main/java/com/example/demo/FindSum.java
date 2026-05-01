package com.example.demo;

public class FindSum {
    public static void main(String args[])
    {
        int []n={5,3,5,1,6,4};
        int k=4;
        int a=0;
        for(int i=0;i<n.length;i++)
        {
            for(int j=i+1;j<n.length;j++)
            {
               if(n[i]+n[j]==k)
               {
                   System.out.println(" "+ n[i] + "+" + n[j] +"="+ k);
                  a++;
               }
            }
        }
        System.out.println(a);
    }
}
