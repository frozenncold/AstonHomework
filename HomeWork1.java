public class HomeWork1 {
        public static void main(String[] args) {


            printThreeWords();
            checkSumSign();
            printColor();
            compareNumbers();
            sumCompare(12, 99);
            positiveNegative(322);
            System.out.println(positiveFalse(-13));
            stringNumber("Понасенков. Я не потакаю серой массе и могу научить вас", 3);
            System.out.println(leapYear(2022));
            array01();
            array100();
            array62();
            arrayTwoDim();
            printArrayInConsole(arguments(14, 13));


        }

        //1
        static void printThreeWords() {
            System.out.println("\nЗадание 1.");
            System.out.println("Orange\nBanana\nApple");
        }

        //2
        static void checkSumSign() {

            System.out.println("\nЗадание 2.");
            int a = 14;
            int b = 22;
            int c = a + b;
            if (c >= 0) System.out.println("Сумма положительная");
            else System.out.println("Сумма отрицательная");
        }

        //3
        static void printColor() {

            System.out.println("\nЗадание 3.");
            int value = 102;
            if (value <= 0) System.out.println("Красный");
            if (value >= 1 && value <= 100) System.out.println("Желтый");
            if (value > 101) ;
            System.out.println("Зеленый");

        }

        //4
        static void compareNumbers() {

            System.out.println("\nЗадание 4.");
            int a = 99;
            int b = 228;
            if (a >= b) System.out.println("a >= b");
            else System.out.println("a < b");
        }

        //5
        static void sumCompare(int a, int b) {

            System.out.println("\nЗадание 5.");
            int sum = a + b;
            boolean compare = sum >= 10 && sum <= 20;
            System.out.println(compare);


        }

        //6
        static void positiveNegative(int a) {

            System.out.println("\nЗадание 6.");
            if (a >= 0) System.out.println("Число положительное");
            else System.out.println("Число отрицательное");
        }

        //7
        static boolean positiveFalse(int a) {

            System.out.println("\nЗадание 7.");
            if (a >= 0) return false;
            else return true;
        }

        //8
        static void stringNumber(String a, int b) {

            System.out.println("\nЗадание 8.");
            for (int i = 0; i < b; i++) {
                System.out.println(a);
            }
        }

        //9
        static boolean leapYear(int year) {

            System.out.println("\nЗадание 9.");
            if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) return false;
            else return true;
        }

        //10
        static void array01() {

            System.out.println("\nЗадание 10.");
            int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

            for (int i = 0; i < arr.length; i++) {
                arr[i] = (arr[i] == 1) ? 0 : 1;
                System.out.println(arr[i]);
            }
        }

        //11
        static void array100() {

            System.out.println("\nЗадание 11.");
            int[] arr1 = new int[100];

            for (int i = 1; i < arr1.length; i++) {
                arr1[i] = i + 1;
                System.out.println(arr1[i]);
            }
        }

        //12
        static void array62(){

            System.out.println("\nЗадание 12.");
            int[] arr62 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

            for (int i = 0; i < arr62.length; i++) {
                if (arr62[i] < 6) {
                    arr62[i] *= 2;
                }
                System.out.println(arr62[i]);
            }
        }

        //13
        static void arrayTwoDim() {

            System.out.println("\nЗадание 13.");
            int[][] arr2x = new int[5][5];

            for (int i = 0; i < arr2x.length; i++) {
                for (int j = 0, z = arr2x.length - 1; j < arr2x.length; j++, z--) {
                    if (i == j || i == z) {
                        arr2x[i][j] = 1;
                    } else {
                        arr2x[i][j] = 0;
                    }
                    System.out.print(arr2x[i][j] + " ");
                }
                System.out.println();
            }
        }

        //14
        public static int[] arguments(int len, int initialValue) {

            System.out.println("\nЗадание 14.");
            int[] array = new int[len];

            for (int i = 0; i < array.length; i++) {
                array[i] = initialValue;
            }
            return  array;
        }

        //Вывод в консоль 14 пункт
        static void printArrayInConsole(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }

}


