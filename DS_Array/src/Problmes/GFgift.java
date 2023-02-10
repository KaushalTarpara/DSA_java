package Problmes;

import java.util.Scanner;

public class GFgift {
    public static void  main(String arg[])
    {



        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter Number of Inpur :");
        int nuberOfInput =sc.nextInt();
        int[] arr=new int[nuberOfInput];
        for(int i=1; i<=nuberOfInput; i++)
        {
//            System.out.println("Enter Value of "+i);
            int nuberOfG=sc.nextInt();
            int coin=0;
            for(int b=0; b<=nuberOfG; b++) {
                 if(nuberOfG<4) {
                   coin+=4;
                   nuberOfG-=4;
                   break;
                 }
                 coin += 4;
                 nuberOfG-=5;

                }
            arr[i - 1] =b;
            }
            // System.out.println("sum is "+ arr[i-1]);



        for(int i=0; i<nuberOfInput; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
