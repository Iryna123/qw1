import java.util.Scanner;
public class Main {
           public static void main(String args[]){
               System.out.print("Введите последовательность символов:");
               Scanner scan = new Scanner(System.in);
               String arguments = scan.nextLine();
               char[] result=arguments.toCharArray();
               System.out.print("Последовательность символов в обратном порядке:");
               for (int i = result.length-1; i>=0; i--)
                                  System.out.print(result[i]);
        }
    }
