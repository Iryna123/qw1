import java.util.Scanner;
public class Compare {
    public static void main(String args[]){
        String pass = "Мой пароль";
                System.out.print("Введите пароль:   ");
        Scanner scan = new Scanner(System.in);
        String pass1 = scan.nextLine();
        if (pass1.equals(pass))
        {
            System.out.println("Вы ввели верный пароль");
        }
        else {
            System.out.println("Вы ввели неверный пароль");
        }
    }

}
