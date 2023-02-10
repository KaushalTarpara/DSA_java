package com.dsarray;

public class Reverse_Array {


    static void printArr(int arr[],int size)
    {
        for(int i=0; i<size; i++)
            System.out.print(arr[i]+" ");

        System.out.println("\n");
    }

    public static void main(String[] args) {
	// Reverse the array


        int[] arr={12,13,14,15,17,19};
        printArr(arr, arr.length);

        int start=0,end=arr.length-1,temp;
        System.out.print("\nReversed array is \n");

        while(start<end)
        {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
        }

        //Time Complexity : O(n)
        printArr(arr, arr.length);


    }
}
