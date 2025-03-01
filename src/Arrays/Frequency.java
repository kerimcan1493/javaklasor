package Arrays;

import java.util.Arrays;

public class Frequency {
    public static void main(String[] args) {

        int[] arr ={1,1,1,2,2,2,2,3,3,4,4,5,5,5};

        int count=1;
        Arrays.sort(arr);

        for (int i=1;i<arr.length;i++){
            if (arr[i]==arr[i-1]){
                count++;
            }else {
                System.out.println(arr[i-1]+"  Sayısı  "+count+"  Kere Tekrar Ediyor.");
                count=1;
            }
        }
        System.out.println(arr[arr.length-1]+"  Sayısı  "+count+"  Kere Tekrar Ediyor.");
    }
}
