import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortIntIncrease {

    public static void bubbleSort(Integer[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j=i+1 ; j <arr.length-1-i ; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
    }
    public static void selectionSort(Integer[] arr){
        for (int i = 0; i < arr.length -1; i++) {
            int key = i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[j] < arr[key]){
                    key = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[key];
            arr[key] = temp;
        }
    }
    public static void insertionSort(Integer[] arr){
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i -1;
            while (j >=0 && arr[j]> key){
                arr[j +1] =arr[j];
                j--;
            }
            arr[j+1] =key;
        }
    }
    public static void printArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Random random =new Random();
        List<Integer> list  = Stream.generate(()->random.nextInt(500)).distinct().limit(100).collect(Collectors.toList());
        Integer[] arr = list.toArray(new Integer[100]);

        System.out.println("Bubble Sort:");
        bubbleSort(arr);
        printArray(arr);
        System.out.println("Selection Sort:");
        selectionSort(arr);
        printArray(arr);

        System.out.println("Insertion Sort:");
        insertionSort(arr);
        printArray(arr);
    }
}
