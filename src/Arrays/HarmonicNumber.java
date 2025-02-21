package Arrays;

public class HarmonicNumber {
    public static void main(String[] args) {
        //ilk önce for döngüsüyle 10 elamanlı bir dizi oluşturduk.
        //buna ek olarak tanımlı bir dizi daha oluşturduk.
        int[] list= new int[10];
        int[] list2={1,2,3,4,5};
        System.out.print("[ ");
        for (int i=0;i<list.length;i++){
            list[i]=i+1;
            System.out.print(list[i]+",");
        }
        System.out.println("]");
        System.out.println(harmonicAverage(list2));


    }

    static double harmonicAverage(int[] arr ){
        double sum=0;
        double total=0;
        for (int i = 0; i< arr.length; i++){
            //burada dizideki elamanların harmonik toplamını hesaplıyoruz.
            sum+=(1.0/arr[i]);
        }
        //eleman sayısını harmonik toplama bölerek harmonik ortalamayı buluyoruz.
        total=arr.length/sum;
        return total;
    }
}
