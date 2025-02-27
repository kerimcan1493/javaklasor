package Arrays;

import java.util.Scanner;

import java.util.Arrays;

public class MaxMinItem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {-10,-5,0,5,10,15,20,25};
        int number;

        System.out.println("Enter a number :  ");
        number = input.nextInt();

        int minDifference=number-arr[0];
        int bigDifferece=number-arr[0];
        int thenearest=arr[0];
        int bigTheNearest=arr[0];

        for (int i: arr){

            int difference=findDifference(number,i);
            if (difference<minDifference){
                minDifference=difference;
                thenearest=i;
            }bigDifferece=findBigNumber(arr,number);
            if (bigDifferece!=-1);

        }
        System.out.println("Girilen Rakamdan Küçük En Yakın Değer  :  " + thenearest);
        System.out.println("GirilenSayıdan Büyük En Yakın Değer  :  "+bigDifferece);
    }
    static int findDifference(int nbr1,int nbr2){
        int diff=nbr1-nbr2;
        if (diff<0)
            diff=-diff;
        return diff;
    }
    static int findBigNumber(int arr[],int value){
        Arrays.sort(arr);
        int theclosest=-1;
        for (int i : arr){
            if (i>value){
                theclosest=i;
                break;
            }
        }
        return theclosest;
    }

}
