public class LinnerSearchMin {
    private static int[] getArr() {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return arr;
    }


    private static int findMinNumber(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        int[] arr = getArr();
        int min = findMinNumber(arr);
        System.out.println("Số nhỏ nhất trong mảng: " + min);
    }
}
