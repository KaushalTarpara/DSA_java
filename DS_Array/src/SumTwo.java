import java.util.Scanner;

public class SumTwo {
    public static void  main(String arg[])
    {
        System.out.println("this is first codesafe problem");


        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter Number of Inpur :");
        int nuberOfInput =sc.nextInt();
        int[] arr=new int[nuberOfInput];
        for(int i=1; i<=nuberOfInput; i++)
        {
//            System.out.println("Enter Value of "+i);
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            arr[i-1]=n1+n2;
         // System.out.println("sum is "+ arr[i-1]);

        }

        for(int i=0; i<nuberOfInput; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
