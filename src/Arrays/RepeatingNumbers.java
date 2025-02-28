package Arrays;

public class RepeatingNumbers {
    public static void main(String[] args) {

        int[] list = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 5, 7, 9};
        int[] repeatnumbers = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i != j && list[i] == list[j]) {
                    if (!isFind(repeatnumbers, list[i])) {
                        if (list[i]%2==0){
                            repeatnumbers[startIndex++] = list[i];
                                                    }
                    }
                    break;
                }
            }
        }
        for (int i : repeatnumbers) {
            if (i != 0) {
                System.out.println(i);
            }
        }

    }

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
    static boolean isEvenNumber(int value){
        if (value%2==0){
            return true;
        }return false;
    }
}
