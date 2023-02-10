package Problmes;

import java.util.Scanner;

public class whoistaller {
    public static void  main(String arg[])
    {



        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter Number of Inpur :");
        int nuberOfInput =sc.nextInt();
        char[] arr=new char[nuberOfInput];
        for(int i=1; i<=nuberOfInput; i++)
        {
//            System.out.println("Enter Value of "+i);
            int hA=sc.nextInt();
            int hB=sc.nextInt();
            if(hA>hB) {
                arr[i - 1] = 'A';
            }
            else
            {
                arr[i-1]='B';
            }

            // System.out.println("sum is "+ arr[i-1]);

        }

        for(int i=0; i<nuberOfInput; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
