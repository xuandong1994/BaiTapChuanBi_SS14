import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Sort {
    public static <T extends Comparable<T>> void bubbleSort(T[] arr){
        int n = arr.length;
        boolean check = true;
        for (int i = 1; i <n && check ; i++) {
            check = false;
            for (int j = i+1; j < n-i-1 ; j++) {
                if ((arr[j].compareTo(arr[j+1])>0)){
                    T temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp;
                    check =true;
                }
            }
        }
    }
    public static <T extends Comparable<T>> void selectionSort(T[] arr){
        for (int i = 0; i < arr.length -1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0){
                    minIndex = j;
                }
                
            }
            T temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static <T extends Comparable<T>> void sort(T[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if ((arr[i].compareTo(arr[j])>0)){
                    T temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                
            }
            
        }
    }
    public static <T extends Comparable<T>> void insertionSort(T[] arr) {
        for (int i = 1; i < arr.length; i++) {
            T current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(current) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }

    public static<T> void main(String[] args) {
        Random random = new Random();
        List<Integer> list =  Stream.generate(()->random.nextInt(100000 )).distinct().limit(10000).toList();
        Integer[] arr = list.toArray(new Integer[10000]);
        Integer[] arr1 = list.toArray(new Integer[10000]);
        Integer[] arr2 = list.toArray(new Integer[10000]);
        Integer[] arr3 = list.toArray(new Integer[10000]);
       long startTime = System.currentTimeMillis();
       bubbleSort(arr);
       long endTime = System.currentTimeMillis();
       long total = endTime - startTime;
        long startTime1 = System.currentTimeMillis();
        selectionSort(arr1);
        long endTime1 = System.currentTimeMillis();
        long total1 = endTime1 - startTime1;
        long startTime2 = System.currentTimeMillis();
        sort(arr2);
        long endTime2 = System.currentTimeMillis();
        long total2 = endTime2 - startTime2;
        long startTime3 = System.currentTimeMillis();
        insertionSort(arr3);
        long endTime3 = System.currentTimeMillis();
        long total3 = endTime3 - startTime3;

        System.out.println("bubbleSort " + total);
        System.out.println("selection " + total1);
        System.out.println("Sort " + total2);
        System.out.println("InsertSort " + total3);


    }
}