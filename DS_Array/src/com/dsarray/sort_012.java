package com.dsarray;
import java.util.*;
public class sort_012 {

    static void printArr(int arr4[],int size)
    {
        for(int i=0; i<size; i++)
            System.out.print(arr4[i]+" ");

        System.out.println("\n");
    }
    public static void main(String[] arg)
    {
        int[] arr4={2,1,0,2,1,0,2,1};

        int temp=0,lo=0,mid=0,hi= arr4.length-1;
        printArr(arr4, arr4.length);
        while(hi >= mid)
        {
            System.out.println("Run "+hi);
            switch (arr4[mid]) {
                case 0 : {
                    temp = arr4[lo];
                    arr4[lo] = arr4[mid];
                    arr4[mid] = temp;
                    mid++;
                    lo++;
                    System.out.println("cas1 "+lo);
                    break;
                }
                case 1 : {
                    mid++;
                    System.out.println("cas1 "+mid);
                    break;
                }
                case 2 : {
                    temp = arr4[mid];
                    arr4[mid] = arr4[hi];
                    arr4[hi] = temp;
                    hi--;
                    System.out.println("cas2 "+hi);
                    break;
                }
            }
        }
        printArr(arr4, arr4.length);
    }
}


/*
Approach:The problem is similar to our old post Segregate 0s and 1s in an array, and both of these problems are variation of famous Dutch national flag problem.
The problem was posed with three colours, here `0′, `1′ and `2′. The array is divided into four sections:
a[1..Lo-1] zeroes (red)
a[Lo..Mid-1] ones (white)
a[Mid..Hi] unknown
a[Hi+1..N] twos (blue)
If the ith element is 0 then swap the element to the low range, thus shrinking the unknown range.
Similarly, if the element is 1 then keep it as it is but shrink the unknown range.
If the element is 2 then swap it with an element in high range.
Algorithm:
Keep three indices low = 1, mid = 1 and high = N and there are four ranges, 1 to low (the range containing 0), low to mid (the range containing 1), mid to high (the range containing unknown elements) and high to N (the range containing 2).
Traverse the array from start to end and mid is less than high. (Loop counter is i)
If the element is 0 then swap the element with the element at index low and update low = low + 1 and mid = mid + 1
If the element is 1 then update mid = mid + 1
If the element is 2 then swap the element with the element at index high and update high = high – 1 and update i = i – 1. As the swapped element is not processed
Print the array.
 */