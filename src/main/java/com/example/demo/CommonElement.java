package com.example.demo;
import java.util.Arrays;
public class CommonElement {
    public static void main(String args[])
    {
        int []a={3,6,1,2,4};
        int[]b={2 ,7 ,3,4,7,9};
        int []c={1,2 ,3,4,5,6 };
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        int co=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                for(int k=0;k<c.length;k++)
                {
                    if(a[i]==b[j]&&b[j]==c[k]){

                        co++;
                    }
                }
            }
        }
        System.out.println(co);




    }
}
