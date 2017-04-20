package com.company;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.Scanner;
import java.io.*;

public class Main {



        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int k = in.nextInt();
            System.out.println(solve(n, k));
        }

        public static int solve(int n, int k) {






            return 0;

        }


    public static int factorial(int n)
    {
        if (n == 0) return 1;
        return n * factorial(n-1);
    }

        int countHowManyArrFits(int n ){
            for(int i = 0; i < factorial(n); i++){
                
            }
        }




    static long mergeSort(int a[],int left,int right)
    {
        int mid;
        long  count = 0;
        if (right > left)
        {
            mid = (right + left)/2;
            count  = mergeSort(a, left, mid);
            count += mergeSort(a,  mid+1, right);


            count += Merge(a, left, mid+1, right);
        }
        return count;
    }

    static long Merge(int a[],int l,int m,int r)
    {

        int length=r-l+1;
        int c[]=new int[length];
        int i=0,j=l,k=m;
        long count=0;
        while(j<=m-1&&k<=r)
        {
            if(a[j]<=a[k])
            {
                c[i]=a[j];
                i++;j++;
            }
            else
            {
                c[i]=a[k];
                count+=m-j;
                i++;k++;
            }
        }

        while(j<=m-1)
        {
            c[i]=a[j];
            i++;j++;
        }

        while(k<=r)
        {
            c[i]=a[k];
            i++;
            k++;
        }
        i=0;
        while(l<=r)
        {
            a[l]=c[i];
            l++;
            i++;
        }
        return count;

    }



}


