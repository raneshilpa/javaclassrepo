package com.company;

public class ArrayAssign1Class {


//2.	Declare an array of char, and store your first name
//3.	Declare a two dimensional array  of 5 by 3, find average  of each column

    public static void main(String[] args) {
        //   Declare an array to hold 10 decimal values and calculate sum of this values
    double arr[]={10.20,11.20,12.20,13.20,14.20,15.20,16.20,17.20,18.20,19.20};
        //2.	Declare an array of char, and store your first name
    char ch[]={'s','h','i','l','p','a'} ;

    int arrAvg[][]= new int[][]
        {
        {11,12,13},
        {21,22,23},
        {31,32,33},
        {41,42,43},
        {51,52,53}
        };
    avgColumn(arrAvg);
    avgCols(arrAvg);



    ArrayAssign1Class as = new ArrayAssign1Class();
        System.out.println("Sum of 10 decimal array is :"+as.sumDecimalArr(arr));
        storeCharArr(ch);

    }

    public double sumDecimalArr(double[] arr)
    {
       double sum=0.0;
       for (int i=0;i<=(arr.length)-1;i++)
           sum = sum+arr[i];
       return sum;
    }
    public static void storeCharArr(char[] ch)
    {
        System.out.println("Name stored in Array :");
        for(int i=0;i<ch.length;i++)
        {
            System.out.print(ch[i]);
        }
    }
    public static void avgColumn(int arrAvg[][])
    {
        int sumcol1 =0;
        int sumcol2 =0;
        int sumcol3=0;

        for(int i=0;i<arrAvg.length;i++)
        {
            sumcol1 = sumcol1 + arrAvg[i][0];
            sumcol2 = sumcol2 + arrAvg[i][1];
            sumcol3 = sumcol3 + arrAvg[i][2];
        }

        System.out.println(" Avg of  column1 is :"+sumcol1/5);
        System.out.println(" Avg of  column1 is :"+sumcol2/5);
        System.out.println(" Avg of  column1 is :"+sumcol3/5);

    }

    public static void avgCols(int arrAvg[][])
    {
        //Calculates sum of each column of given matrix
        for(int i = 0; i < arrAvg[0].length; i++){
            int sumCol = 0;
            for(int j = 0; j < arrAvg.length; j++){
                sumCol = sumCol + arrAvg[j][i];
            }
            System.out.println("Avg of "+(i+1)+" column  : " +sumCol/ arrAvg.length);
        }
    }



}
