import java.util.Scanner;
public class Arithmetic {
    public static void main(String args[]) {
        System.out.print("Ведите пять целых чисел: ");
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int w = scan.nextInt();
        int e = scan.nextInt();
        int r = scan.nextInt();
        int t = scan.nextInt();
        int sum=q+w+e+r+t;
        int prod=q * w * e * r * t;
        System.out.println("Сумма чисел:  "+sum);
        System.out.println("Произведение чисел:  "+prod);
    }
}