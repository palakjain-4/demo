package com.example.demo;

public class CyclicRotation {
    public static void main(String args[])
    {
        int []n={10,20,30,40};
        int k=1;
        int a=n.length;
        int start;
        int end;
        int temp;
        start=0;
        end=a-1;
        while(start<end)
        {
            temp=n[start];
            n[start]=n[end];
            n[end]=temp;
            start++;
            end--;

        }
        start=0;
        end=k-1;
        while(start<end)
        {
            temp=n[start];
            n[start]=n[end];
            n[end]=temp;
            start++;
            end--;

        }
        start=k;
        end=a-1;
        while(start<end)
        {
            temp=n[start];
            n[start]=n[end];
            n[end]=temp;
            start++;
            end--;

        }
        for(int i=0;i<a;i++)
        {
            System.out.println(n[i]);
        }


}}
