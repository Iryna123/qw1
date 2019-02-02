import java.util.Scanner;

class Hellouser {
    public static void main(String args[]){
        System.out.print("Как Вас зовут?  ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println ("Привет, " + name+"!");
    }
}