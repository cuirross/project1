import java.util.Arrays;

public class HomeWorkAppLesson5 {
    public static void main(String[] args) {
//    int[] arr ;
//    arr=initializationList(5);
//    arr=addLast(arr,2);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(searchIndex(arr, 5));
//        System.out.println(returnList(arr));
//        int[] arr2;
//        arr2=queue(5);
//        System.out.println((Arrays.toString(arr2)));
//        addQueue(arr2, 5);
//        addQueue(arr2, 7);
//        addQueue(arr2, 8);
//        addQueue(arr2, 7);
//        addQueue(arr2, 7);
//        addQueue(arr2, 7);
//        System.out.println((Arrays.toString(arr2)));
//        System.out.println(getInQueue(arr2));
//        System.out.println(Arrays.toString(arr2));
        int [] arr2;
        arr2 = dualQueue(7);
        System.out.println(Arrays.toString(arr2));
        addToHead(arr2, 5);
        System.out.println(Arrays.toString(arr2));
        getFromHead(arr2);
        System.out.println(Arrays.toString(arr2));
        addToTail(arr2, 9);
        addToTail(arr2, 8);
        System.out.println(Arrays.toString(arr2));
        getFromTail(arr2);
        System.out.println(Arrays.toString(arr2));


    }
    static int[] initializationList (int size){
        return new int[size];


    }
    static int[] addLast (int []arr, int value){
        int[] newArr = new int[arr.length+1];
        for (int i = 0; i < arr.length ; i++) {
            newArr[i] = arr[i];

        }
         newArr[newArr.length -1] = value;
    return newArr;
    }
    static int searchIndex (int[] arr, int index){
    if (index < 0 || index > arr.length){
        System.out.println("Ошибка, индекс не может быть отрицательным, или выходить за пределы массива дон");
        return -1;
    }

        return arr[index];

    }
    static int returnList (int[] list){
        return list.length;

    }

static int[] queue (int queueSize) {
    if (queueSize <= 0)
    {
        return new int[0];

    }

 return new int[queueSize+1];
}
static void addQueue(int[] arr, int value){
        int count = arr[0];
        if (arr.length<=0 || arr.length -1==count){
            return;
        }
        arr[++count] = value;
        arr[0] = count;


}
static int getInQueue(int [] arr){
        int count = arr[0];
        int firstValue = arr[1];
        if (arr.length == 0 || count==0){
            return -1;
        }
    for (int i = 2; i <count ; i++){
        arr[i-1] = arr[i];
    }
    arr[count] = 0;
    arr[0] = count -1;
    return firstValue;
}
  static int[] dualQueue(int size){
        if (size <= 0){
            return new int[0];
        }
        int head = 0;
        int tail = 1;
        int start = 2;
        int[] arr = new int[size+2];
        arr[head] = start;
        arr[tail] = arr.length -1;
        return arr;
  }
  static void addToHead(int[] arr, int value){
      int head = 0;
      int tail = 1;
      int start = 2;
      if (arr.length <= start || arr[head] >= arr[tail]){
          return;
      }
      arr[arr[head]] = value;
      arr[head]++;
  }
  static int getFromHead (int[] arr){
      int head = 0;
      int tail = 1;
      int start = 2;
      if (arr[head] == start){
          return -1;
      }
      int firstElement = arr[start];
      for (int i = start +1; i <arr[head]; i++) {
          arr[i -1] = arr[i];
      }
      arr[head]--;
      arr[arr[head]] = 0;
      return firstElement;
  }
    static void addToTail(int[] arr, int value){
        int head = 0;
        int tail = 1;
        int start = 2;
        if (arr.length <= start || arr[head] >= arr[tail]){
            return;
        }
        arr[arr[tail]] = value;
        arr[tail]--;

}
    static int getFromTail (int[] arr) {
        int tail = 1;
        int end = arr.length - 1;
        if (arr[tail] == end) {
            return -1;
        }
        int lastElement = arr[end];
        for (int i = end; i > arr[tail] + 1; i--) {
            arr[i] = arr[i-1];
        }
        arr[tail]++;
        arr[arr[tail]] = 0;
        return lastElement;
    }
}

