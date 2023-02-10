package Problmes;

import java.util.Scanner;

public class ChoosMask {
    public static void  main(String arg[])
    {



        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter Number of Inpur :");
        int nuberOfInput =sc.nextInt();
        String[] arr=new String[nuberOfInput];
        for(int i=1; i<=nuberOfInput; i++)
        {
//            System.out.println("Enter Value of "+i);
            int X=sc.nextInt();
            int Y=sc.nextInt();
            int  X2=X*100;
            int  Y2=Y*10;
            if(X2>=Y2) {
                arr[i - 1] = "Cloth";
            }
            else
            {
                arr[i-1]="Disposable";
            }

            // System.out.println("sum is "+ arr[i-1]);

        }

        for(int i=0; i<nuberOfInput; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
