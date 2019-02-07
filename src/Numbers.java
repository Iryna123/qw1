import java.util.Scanner;
public class Numbers {
    public static void main(String args[]) {
        System.out.println("Введите количество чисел в массиве: ");
        Scanner scan1 = new Scanner(System.in);
        int size = scan1.nextInt();
        int[] arr = new int[size];
        System.out.println("Введите " + size + " чисел: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan1.nextInt();
        }
        System.out.println("Четные числа: ");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] + " ");
            }
        }
        System.out.println("Нечетные числа: ");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i] + " ");
            }
        }
        System.out.println("Минимальное число: ");
        int min = arr[0];
        for (int i = 0; i < size; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
        System.out.println("Максимальное число: ");
        int max = arr[0];
        for (int i = 0; i < size; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
        int l=0;
        System.out.println("Числа, которые делятся на 3 или на 9: ");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 3 == 0 || arr[i] % 9 == 0) {
                l=1; System.out.println(arr[i] + " "); }
                       }
        if (l==0)
        { System.out.println("Нет таких чисел ");
        }
        int f=0;
            System.out.println("Числа, которые делятся на 5 и на 7: ");
            for (int i = 0; i < size; i++) {
                if (arr[i] % 5 == 0 && arr[i] % 7 == 0) {
                  f=1;  System.out.println(arr[i] + " ");
                }
                }
        if (f==0)
        { System.out.println("Нет таких чисел ");
            }
            int q, w, e;
        int k=0;
            System.out.println("Трехзначные числа, в десятичной записи которых нет повторяющихся цифр: ");
            for (int i = 0; i < size; i++) {
                if (arr[i] > 99 && arr[i] < 1000) {
                    q = arr[i] / 100;
                    w = (arr[i] / 10) % 10;
                    e = arr[i] % 10;
                    if (q != w && q != e && w != e) {
                       k=1; System.out.println(arr[i]);
                    }                 }
            }
        if (k==0)
        { System.out.println("Нет таких чисел ");
        }
            System.out.println("Cчастливые числа: ");
            int q_1, q_2, q_3, q_4, q_5, q_6;
            int h=0;
            for (int i = 0; i < size; i++) {
                if (arr[i] >= 100000 && arr[i] < 1000000) {
                    q_1 = arr[i] / 100000;
                    q_2 = (arr[i] / 10000) % 10;
                    q_3 = (arr[i] / 1000) % 10;
                    q_4 = (arr[i] / 100) % 10;
                    q_5 = (arr[i] / 10) % 10;
                    q_6 = arr[i] % 10;
                    if ((q_1 * q_2 * q_3) == (q_4 * q_5 * q_6)) {
                        h=1; System.out.println(arr[i]);
                    }
                }
                }
        if (h==0)
        { System.out.println("Нет таких чисел ");
                }
            }
        }


