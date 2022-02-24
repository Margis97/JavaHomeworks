/**
* Java 1. Homework3
* @author Margarita Morozova
* @version 23.2.2022
*/
import java.util.Arrays;

class Homework3 {
    public static void main(String[] args) {
        changeNumber();
        oneHundred();
        lessSix();
        diagonal();
        int[] someArray = createArray(5, 5);
        System.out.println("\n" + Arrays.toString(someArray));
        System.out.println("\n" + Arrays.toString(minMax()));
    }

    static void changeNumber() {
        int[] arr = { 1, 0, 0, 1, 1, 0 };
        for (int a = 0; a < arr.length; a++) {
            if (arr[a] == 1) {
                arr[a] = 0;
            } else {
                arr[a] = 1;
            }
        }
        System.out.println("\n" + Arrays.toString(arr) + "\n");
    }

    static void oneHundred() {
        int[] zip = new int[100];
        for (int z = 0; z < zip.length; z++) {
            zip[z] = z + 1;
        }
        System.out.println(Arrays.toString(zip));
    }

    static void lessSix() {
        int[] rar = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int r = 0; r < rar.length; r++) {
            if (rar[r] < 6) {
                rar[r] = rar[r] * 2;
            }
        }
        System.out.println("\n" + Arrays.toString(rar) + "\n");
    }

    static void diagonal() {
        int count1 = 0;
        int count2 = 1;
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = count1;
                arr[0][0] = count2;
                arr[1][1] = count2;
                arr[2][2] = count2;
                arr[3][3] = count2;
                arr[0][3] = count2;
                arr[1][2] = count2;
                arr[2][1] = count2;
                arr[3][0] = count2;
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int y = 0; y < len; y++) {
            array[y] = initialValue;
            initialValue++;
        }
        return array;
    }

    static int[] minMax() {
        int[] arr = {3, 1, -5, -2, 8, 7};
        int min = arr[0], max = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return new int[] {min, max};
    }
}
