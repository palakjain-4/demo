package com.example.demo;

public class problem2
{
    public static void main(String[] args)
    {
        int [] n= {8,6,3,5,2,8};
        System.out.println(n.length);
        for(int i=0;i<n.length;i++)
        {
            for(int j=i+1;j<n.length;j++)
            {
                if(n[i]==n[j])
                {
                    n[j]= -1;
                    System.out.println("["+n[i]+"]");
                }
            }
            for(i=0;i<n.length;i++)
            {
                if(n[i]!=-1)
                {
                    System.out.println("["+n[i]+"]");
                }

            }

        }


    }
}
