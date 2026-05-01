package com.example.demo;
import java.util.*;

public class UnionIntersection {
    public static void main(String args[])
    {
        int[] n = {10,20,30,40,50};
        int[] p = {20,10,23,40,50};

        Arrays.sort(n);
        Arrays.sort(p);

        System.out.println(Arrays.toString(n));
        System.out.println(Arrays.toString(p));

        // Print all elements of first array
        for(int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }

        // Check elements of second array
        for(int j = 0; j < p.length; j++) {
            boolean found = false;

            for(int i = 0; i < n.length; i++) {
                if(p[j] == n[i]) {
                    found = true;
                    break;
                }
            }

            if(!found) {
                System.out.println(p[j] +" ");
            }
        }
        for(int i=0;i<n.length;i++)
        {
            for(int j=0;j<p.length;j++)
            {
                if(n[i]==p[j])
                {
                    System.out.println(n[i] +" ");
                    break;
                }
            }
        }
    }
}