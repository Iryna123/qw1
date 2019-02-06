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
                System.out.println(arr[i]+" ");
            }
        }
        System.out.println("Нечетные числа: ");
        for (int i = 0; i < size; i++) {
            if (arr[i]%2!=0){
                System.out.println(arr[i]+" ");
                }
        }
        System.out.println("Минимальное число: ");
        int min=arr[0];
        for (int i = 0; i < size; i++) {
            if (min>arr[i]){
                min=arr[i];
            }
                            }
        System.out.println(min);
        System.out.println("Максимальное число: ");
        int max=arr[0];
        for (int i = 0; i < size; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
        System.out.println("Числа, которые делятся на 3 или на 9: ");
               for (int i = 0; i < size; i++) {
            if (arr[i]%3==0||arr[i]%9==0){
                System.out.println(arr[i]+" ");
            }
                                }

        System.out.println("Числа, которые делятся на 5 и на 7: ");
        for (int i = 0; i < size; i++) {
            if (arr[i]%5==0&&arr[i]%7==0){
                System.out.println(arr[i]+" ");
            }
        }
        System.out.println("Введите 6 трехзначных чисел");
        int q, w, e;
        System.out.println("Трехзначные числа, в десятичной записи которых нет повторяющися цифр: ");
        for (int i = 0; i < size; i++) {
            if (arr[i]>99 && arr[i]<=1000){
                q = (arr[i]/10)/10;
                w = (arr[i]/10)%10;
                e = (arr[i]%100)%10;
                if (q !=w && q != e && w != e )
                    System.out.println(arr[i]);
                }
            System.out.println("Трехзначные числа, в десятичной записи которых нет повторяющися цифр: ");
            }

            }

    }
