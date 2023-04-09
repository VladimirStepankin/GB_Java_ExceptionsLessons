package lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkLessonOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите номер задания для проверки (1,2 или 3: )");
        int num = scan.nextInt();
        switch (num) {
            case 1 -> exerciseOne();
            case 2 -> exerciseTwo();
            case 3 -> exerciseThree();
            default -> System.out.println("Введен неверный номер");
        }
    }

    private static void exerciseOne() {
        int[] numArray = new int[]{1, 2, 3, 0, 5, 6, 0, 8};
//        numArray = null;
        checkArray(numArray);
    }

    private static void checkArray(int[] arr) {
        boolean flag = true;
        if (arr == null) {
            throw new NullPointerException("Array is null");
        }
        if (arr.length == 0) {
            throw new ArrayIndexOutOfBoundsException("Array is empty");
        }
        for (int i = 0; i < arr.length; i++) {
            try {
                if (arr[i] == 0) {
                    flag = false;
                    throw new RuntimeException();
                }
            } catch (RuntimeException e) {
                System.out.printf("Null in array. Index is %d\n", i);
            }
        }
        if (flag) {
            System.out.println("Null not found");
        }
    }

    private static void exerciseTwo() {
        int[] numArrayA = new int[]{1, 2, 3, 0, 5, 6, 0, 8};
        int[] numArrayB = new int[]{1, 2, 3, 0, 5, 6, 0};
        int[] numArrayC = getSummArrays(numArrayA, numArrayB);
        System.out.println(Arrays.toString(numArrayC));
    }

    private static int[] getSummArrays(int[] arrayA, int[] arrayB) {
        int[] arrayResult = new int[arrayA.length];
        if (arrayA.length != arrayB.length) {
            throw new RuntimeException("Длины массивов не совпадают");
        }
        for (int i = 0; i < arrayResult.length; i++) {
            arrayResult[i] = arrayA[i] + arrayB[i];
        }
        return arrayResult;
    }

    private static void exerciseThree() {
        int[][] numMatrix = new int[][]{{1, 2, 3}, {0, 1, 4}, {1, 2, 3}};
        checkMatrix(numMatrix);
    }

    private static void checkMatrix(int[][] matrix) {
        if (matrix == null) {
            throw new NullPointerException("Matrix is null");
        }
        if (matrix.length == 0) {
            throw new ArrayIndexOutOfBoundsException("Matrix is empty");
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != matrix.length) {
                throw new RuntimeException("Длинна строк и столбцов неодинакова");
            }
        }
        System.out.println("Длинна строк и столбцов совпадает");
    }
}
