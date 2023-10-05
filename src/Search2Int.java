import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Search2Int {
    public static int[][] getArr() {
        int[][] arr = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        return arr;
    }

    public static boolean findNumber(int[][] arr, int number) {
        // Tạo 2 List để lưu vị trí của số cần tìm
        List<Integer> rowList = new ArrayList<>();
        List<Integer> colList = new ArrayList<>();

        // Khởi tạo biến check
        boolean check = false;

        // Duyệt qua tất cả phần tử của mảng 2 chiều
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // Nếu tìm thấy số cần tìm thì cập nhật biến check và lưu vị trí vào 2 list
                if (arr[i][j] == number) {
                    check = true;
                    rowList.add(i);
                    colList.add(j);
                }
            }
        }

        // In ra các vị trí của số cần tìm
        if (check) {
            System.out.println("Số " + number + " xuất hiện tại các vị trí:");
            for (int i = 0; i < rowList.size(); i++) {
                System.out.println("(" + rowList.get(i) + ", " + colList.get(i) + ")");
            }
        }

        // Trả về biến check
        return check;
    }

    public static void main(String[] args) {
        // Nhập số cần tìm
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần tìm: ");
        int number = scanner.nextInt();

        // Tạo mảng 2 chiều
        int[][] arr = getArr();

        // Tìm số cần tìm
        boolean isFound = findNumber(arr, number);

        // In kết quả
        if (isFound) {
            System.out.println("Tìm thấy số " + number);
        } else {
            System.out.println("Không tìm thấy số " + number);
        }
    }
}
