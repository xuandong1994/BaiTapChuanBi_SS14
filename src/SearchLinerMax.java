import java.util.Scanner;

public class SearchLinerMax {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần tìm: ");
        int number = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Tìm thấy số " + number + " tại vị trí " + index);
        } else {
            System.out.println("Không tìm thấy số " + number);
        }
    }
}

