package com.company;

public class BoundryArrayClass
{
    public static void main(String[] args) {
    int arr[][]=new int[][]
            {       {1,2,3,4},
                    {5,6,7,8},
                    {9,1,2,4}
            };
    printBoundry(arr);
    }
    public static void printBoundry(int arr[][])
    {
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(i==0 || j==0 || i==(arr.length)-1 || j== (arr[0].length)-1)
                {
                    System.out.print(arr[i][j]);
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

}
