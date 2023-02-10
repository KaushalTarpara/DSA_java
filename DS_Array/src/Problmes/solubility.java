package Problmes;

import java.util.Scanner;

public class solubility {


    public static void  main(String arg[])
    {



        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter Number of Inpur :");
        int nuberOfInput =sc.nextInt();
        int[] arr=new int[nuberOfInput];
        for(int i=1; i<=nuberOfInput; i++)
        {
//            System.out.println("Enter Value of "+i);
            int x=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int ans=(a+((100-x)*b))*10;
            arr[i-1]=ans;
            // System.out.println("sum is "+ arr[i-1]);

        }

        for(int i=0; i<nuberOfInput; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
