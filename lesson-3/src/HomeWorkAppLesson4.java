import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeWorkAppLesson4 {
    public static void main(String[] args) {
//       int[] arr = {0, 1};
//        firstArray(arr);
//        secondArray(100);
        int[] arr1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9};
//        arr1 = thirdArray(arr1);
//        System.out.println(Arrays.toString(arr1));
//        fourthArray();
//        int[] arr2;
//        arr2 = fivethArray(5,5);
//        System.out.println(Arrays.toString(arr2));
        sixthArray(arr1);
        int[] arr2 = {2, 2, 2, 1, 2, 2, 10};
        boolean result=seventhArray(arr2);
        System.out.println(result);
    }

    static void firstArray (int[] arr){
        for (int i=0; i<arr.length; i++){
           if (arr [i]==0){
               arr [i]=1;
           }
           else if (arr [i]==1){
               arr [i]=0;
           }
            System.out.println(arr [i]);
        }

    }

    static void secondArray (int size ){
        int[] arr = new int[size];
        for (int i=0; i<size; i++){
            arr [i] = i+1;
            System.out.print(arr[i] + " ");
        }
    }

    static int[] thirdArray (int[] arr){
        for (int i=0; i<arr.length; i++){
            if (arr[i]<6){
                arr[i]*=2;
            }
        }
        return arr;
    }
    static void fourthArray (){
        int[][] arr = new int[][] {
                {0,0,0},
                {0,0,0},
                 {0,0,0}
        };
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                if (i == j || i + j == arr.length - 1){
                    arr[i][j] = 1;
                }

                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    static int[] fivethArray(int len, int initialValue){
       int[] arr2 = new int[len];
       for (int i=0; i<len; i++){
           arr2[i] = initialValue;
        }
       return arr2;
    }

    static void sixthArray(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];

            }if (arr[i] > max) {
                max = arr[i];

            }
        }
        System.out.println("Минимал " + min);
        System.out.println("Max " + max);
    }

    static boolean seventhArray(int[] arr){
        for(int i=1; i<arr.length; i++){
            int leftSumm = 0;
            int rightSumm = 0;
        for (int j=0; j<i; j++) {
            leftSumm += arr[j];
        }
        for(int j=i; j<arr.length; j++){
            rightSumm += arr[j];

        }if(leftSumm==rightSumm){
            return true;
            }
        }
        return false;
    }
}
