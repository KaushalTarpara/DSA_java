package com.dsarray;

public class MAX_MIN {
    /*
    Time Complexity: O(n)

    In this method, the total number of comparisons is 1 + 2(n-2) in the worst case and 1 + n – 2 in the best case.
    In the above implementation, the worst case occurs when elements are sorted in descending order and the best case occurs when elements are sorted in ascending order.
     */

    public static void main(String[] arr)
    {
        System.out.println("Thsi max_min Array DS" );

        int[] arrM={23,50335,-409,9,50,40,5000,6};
        int MAX=0,MIN=0,i=0;

        while( i < arrM.length-1)
        {
            if(arrM[MAX] < arrM[i])
            {
                //arrM[MAX] = arrM[i+1];
                MAX=i;
                System.out.println("I is "+i);
                System.out.println("max is "+MAX);
            }else if(arrM[MIN] > arrM[i])
            {
                //arrM[MAX] = arrM[i+1];
                MIN=i;
                System.out.println("min is "+MIN);
            }
            i++;
        }
        System.out.println("MAx Value of Array : "+arrM[MAX]);
        System.out.println("Min Value of Array : "+arrM[MIN]);
    }

}
