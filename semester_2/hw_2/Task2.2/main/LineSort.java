/*
 Отсортировать столбцы матрицы по первым элементам
 */
package main;

public class LineSort {

    public static void main(String[] args) {
        int[][] array = {{5, 6, 4}, {1, 2, 3}, {7, 8, 9}};

        printMatrix(array);
        Sort(array);
        printMatrix(array);
    }

    private static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void columnSwap(int[][] arr, int i, int j) {
        int[] temp = new int[arr.length];
        for (int k = 0; k < arr.length; k++) {
            temp[k] = arr[k][i];
            arr[k][i] = arr[k][j];
            arr[k][j] = temp[k];
        }
    }

    private static void Sort(int[][] array) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[0][i] > array[0][i + 1]) {
                    columnSwap(array, i, i + 1);
                    flag = true;
                }
            }
        }
    }
}