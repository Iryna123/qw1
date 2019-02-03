public class Random {
    public static void main(String[] args){
        System.out.println("Система сгенерировала и вывела случайные числа в интервалах [0;1),[0;5),[15;21), [-56;89)");
        double a = Math.random();
        double b = Math.random()*5;
        double c = 15+Math.random()*6;
        double d =-56+ Math.random()*(145);


        System.out.println (a+" ; "+b+" ; "+c+" ; "+d);
        System.out.println (a);
        System.out.println (b);
        System.out.println (c);
        System.out.println (d);
    }
}
