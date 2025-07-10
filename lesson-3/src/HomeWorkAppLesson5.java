import java.util.Arrays;

public class HomeWorkAppLesson5 {
    public static void main(String[] args) {
        int [] source = {1, 2, 3, 4, 5, 6, 7};
        int [] target = {12, 6, 11, 3, 8, 10};
        arrayCopy(source, target);
        shaker(target);
        System.out.println(Arrays.toString(target));
    }
    static void arrayCopy (int[] source, int[] target){
        int[] arr3 = new int[source.length + target.length];
        int index = 0;
        for (int i = 0; i <arr3.length ; i++) {
            if(i<target.length){
                arr3[i] = target[i];
            } else {
                arr3[i] = source[index];
                index++;
            }


        }


        System.out.println(Arrays.toString(arr3));
    }
    static void shaker (int[] arr){
        var left = 0;
        var right = arr.length -1;
        boolean swapped = true;
        while (left < right){
            swapped = false;
            for (int i = 0; i < right; i++){
                if (arr[i] > arr[i + 1]){
                    var newLeft = arr [i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = newLeft;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
            right--;
            for (int j = right; j > 0; j--){
                if (arr[j] < arr[j - 1]){
                    var newRight = arr [j];
                    arr[j] = arr[j - 1];
                    arr[j -1] = newRight;
                    swapped = true;
                }

            }
            if (!swapped){
                break;
            }
            left++;

        }

    }
}

