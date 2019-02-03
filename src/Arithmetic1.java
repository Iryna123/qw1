import java.util.Scanner;
public class Arithmetic1 {
    public static void main(String args[]) {
        System.out.println("Введите количество чисел в массиве: ");
        Scanner scan1 = new Scanner(System.in);
        int size = scan1.nextInt();
        int[] arr = new int[size];
        System.out.println("Введите " + size + " чисел: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan1.nextInt();
        }
        System.out.println("Ваш массив:");
        for (int i = 0; i < size; i++) {
            System.out.println(" " + arr[i]);
        }
        System.out.println("Произведение чисел массива: ");
            int k = 1;
            for (int j = 0; j < size; j++) {
                k = k * arr[j];
            }
            System.out.println(k);
        System.out.println("Сумма чисел массива: ");
        int p = 0;
        for (int j = 0; j < size; j++) {
            p = p + arr[j];
        }
        System.out.println(p);
        }
    }

