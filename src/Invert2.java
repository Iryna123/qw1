import java.util.Arrays;
public class Invert2 {
    public static void main(String args[]) {
                int[] arr = {4, 6, 8, 9, 5, 6};
        for (int i = 0; i < (arr.length / 2); i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
                    }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]);
        }
    }
}
