import java.util.Scanner;
public class Arithmetic1 {
    public static void main(String args[]) {
        System.out.print("Ведите числа: ");
        double[] arr = new double[50];
        Scanner scan = new Scanner(System.in);
                for (int i = 0; i <= 50; i++) {
            arr[i] = scan.nextDouble();
                        System.out.print(arr[i]);
        }
    }
}