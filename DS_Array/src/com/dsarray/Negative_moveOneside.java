package com.dsarray;

public class Negative_moveOneside {


    static void printArr(int arr5[],int size)
    {
        for(int i=0; i<size; i++)
            System.out.print(arr5[i]+" ");

        System.out.println("\n");
    }
    static void swap(int[] arr5,int low,int high)
    {
        int temp = arr5[low];
        arr5[low]=arr5[high];
        arr5[high]=temp;
    }
    public static void main(String[] arr)
    {
        int[] arr5={ 1, 2,  -4, -5, 2, -7, 3,2, -6, -8, -9, 3, 2,  1};
        int temp=0,n=arr5.length,j=0;

        printArr(arr5,arr5.length);
// 1. First approach
//        for(int i=0; i<n; i++)
//        {
//            if(arr5[i] < 0)
//            {
//                if( i !=j )
//                {
//                    temp = arr5[i];
//                    arr5[i]=arr5[j];
//                    arr5[j]=temp;
//                }
//                j++;
//            }
//
//        }
        //Second Approach ( Dutch National Flag Algorithm )
        /*

Here, we will use the famous Dutch National Flag Algorithm for two “colors”.
 The first color will be for all negative integers and the second color will be for all positive integers.
  We will divide the array into three partitions with the help of two pointers, low and high.

1. ar[1…low-1] negative integers

2. ar[low…high] unknown

3. ar[high+1…N] positive integers

Now, we explore the array with the help of low pointer, shrinking the unknown partition, and moving elements to their correct partition in the process.
    We do this until we have explored all the elements, and size of the unknown partition shrinks to zero.
         */
        int low=0;
        int high=arr5.length-1;
        while (low <= high)
        {
            if(arr5[low]<=0)
                low++;
            else
            {
             swap(arr5,low,high--);
            }

        }
        printArr(arr5,arr5.length);
    }
}
