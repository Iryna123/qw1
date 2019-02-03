import java.util.Scanner;
public class Happy {
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
                System.out.println(arr[i]+" ");
            }
        }
        System.out.println("Нечетные числа: ");
        for (int i = 0; i < size; i++) {
            if (arr[i]%2!=0){
                System.out.println(arr[i]+" ");
                }
        }
    }
}