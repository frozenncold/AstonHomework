import java.util.Arrays;

public class HomeWork1 {
    static void printThreeWords() {
        System.out.println("\nЗадание 1.");
        String fruit = "Orange";
        String fruit1 = "Banana";
        String fruit2 = "Apple";
        System.out.println(fruit + "\n" + fruit1 + "\n" + fruit2);
    }

    static void checkSumSign() {
        System.out.println("\nЗадание 2.");
        int a = 14;
        int b = 22;
        int c = a + b;
        if (c >= 0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }

    static void printColor() {
        System.out.println("\nЗадание 3.");
        int value = 101;
        if (value <= 0) System.out.println("Красный");
        else if (value <= 100) System.out.println("Желтый");
        else System.out.println("Зеленый");

    }

    static void compareNumbers() {
        System.out.println("\nЗадание 4.");
        int a = 99;
        int b = 228;
        if (a >= b) System.out.println("a >= b");
        else System.out.println("a < b");
    }

    static void sumCompare(int a, int b) {
        System.out.println("\nЗадание 5.");
        int sum = a + b;
        boolean compare = sum >= 10 && sum <= 20;
        System.out.println(compare);
    }

    static void positiveNegative(int a) {
        System.out.println("\nЗадание 6.");
        if (a >= 0) System.out.println("Число положительное");
        else System.out.println("Число отрицательное");
    }

    static boolean positiveFalse(int a) {
        System.out.println("\nЗадание 7.");
        if (a >= 0) return false;
        else return true;
    }

    static void stringNumber(String a, int b) {
        System.out.println("\nЗадание 8.");
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    static boolean leapYear(int year) {
        System.out.println("\nЗадание 9.");
        return year % 4 == 0 && ((year % 100 != 0) || year % 400 == 0);
    }

    static void array01() {
        System.out.println("\nЗадание 10.");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 1) ? 0 : 1;
            System.out.println(Arrays.toString(arr));
        }
    }

    static void array100() {
        System.out.println("\nЗадание 11.");
        int[] arr100 = new int[100];
        for (int i = 0; i < arr100.length; i++) {
            arr100[i] = i + 1;
            System.out.println(Arrays.toString(arr100));
        }
    }

    static void array62() {
        System.out.println("\nЗадание 12.");
        int[] arr62 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr62.length; i++) {
            if (arr62[i] < 6) {
                arr62[i] *= 2;
            }
            System.out.println(Arrays.toString(arr62));
        }
    }

    static void arrayTwoDim() {
        System.out.println("\nЗадание 13.");
        int c = 5;
        int[][] arr2x = new int[c][c];

        for (int i = 0; i < arr2x.length; i++) {
            for (int j = 0; j < arr2x.length; j++) {
                if (i == j) {
                    arr2x[i][j] = 1;
                    arr2x[i][arr2x.length - 1 - i] = 1;
                }
            }
        }    // Вывод массива
        for (int[] x : arr2x) {
            for (int j = 0; j < arr2x.length; j++) {
                System.out.print(x[j] + " ");
            }
            System.out.println();
        }
    }

    static int[] arguments(int len, int initialValue) {
        System.out.println("\nЗадание 14.");
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        sumCompare(12, 99);
        positiveNegative(322);
        System.out.println(positiveFalse(-13));
        stringNumber("Понасенков. Я не потакаю серой массе и могу научить вас", 3);
        System.out.println(leapYear(100));
        array01();
        array100();
        array62();
        arrayTwoDim();
        arguments(6, 4);
    }
}
