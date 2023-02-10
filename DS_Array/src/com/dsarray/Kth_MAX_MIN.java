package com.dsarray;

public class Kth_MAX_MIN {
    static void printArr(int arr3[],int size)
    {
        for(int i=0; i<size; i++)
            System.out.print(arr3[i]+" ");

        System.out.println("\n");
    }

    public static void main(String[] arg) {

        int[] arr3={2,3,5,1,100,76,89,90};
        int n =arr3.length;
        int k = 2;
        int mk= arr3.length-k;
        int a=1;

        printArr(arr3,n);

        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(arr3[i]>arr3[j]) {
                    int temp = arr3[i];
                    arr3[i] = arr3[j];
                    arr3[j] = temp;

                    System.out.println("element is chaneg"+a++);
                }
            }
    }
    printArr(arr3,n);

        System.out.println("Smallest Kth("+k+") Element of Array is :"+arr3[k-1]);
        System.out.println("Biggest Kth("+k+") Element of Array is :"+arr3[mk]);
    }
}
