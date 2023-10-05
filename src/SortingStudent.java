import java.util.Arrays;

public class SortingStudent {
    public static Students[] insertionSort(Students[] students) {
        for (int i = 0; i < students.length; i++) {
            Students key = students[i];
            int j = i -1;
            while (j>=0 && students[j].getScore() > key.getScore()){
                students[j+1] = students[j];
                j--;
            }
            students[j+1] = key;
        }
        return students;
    }
    public static Students[] selectionSort(Students[] students) {
        for (int i = 0; i < students.length; i++) {
            int index = i;
            for (int j = i+1; j < students.length; j++) {
                if (students[j].getId() < students[index].getId()){
                    index = j;
                }
            }
            Students temp = students[i];
                    students[i] = students[index];
                    students[index] = temp;

        }
        return students;
    }
    public static Students[] bubbleSort(Students[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].getName().compareTo(students[j + 1].getName()) > 0) {
                    Students temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        return students;
    }
    public static void printStudent(Students[] students){
        for (Students s : students) {
            System.out.println("ID: " + s.getId() +
                    ", Name: " + s.getName() +
                    ", Score: " + s.getScore());
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Students[] students = new Students[8];
        students[0] = new Students(1, "Alice", 85.5);
        students[1] = new Students(3, "Bob", 76.0);
        students[2] = new Students(5, "Charlie", 92.3);
        students[3] = new Students(4, "David", 80.8);
        students[4] = new Students(7, "a", 99);
        students[5] = new Students(6, "b", 100);
        students[6] = new Students(9, "c", 78.2);
        students[7] = new Students(8, "Emily", 88.2);

        Students[] sortedStudents;

        System.out.println("InsertionSort: ");
        sortedStudents = SortingStudent.insertionSort(students);
        printStudent(sortedStudents);


        System.out.println("BubbleSort: ");
        sortedStudents = SortingStudent.bubbleSort(students);
        printStudent(sortedStudents);

        System.out.println("Selection: ");
        sortedStudents = SortingStudent.selectionSort(students);
        printStudent(sortedStudents);


    }
}
