public class Test1 {
    public static void main(String args[]) {
        String strInt = "123";
        String strDouble = "1234.5678";
        int x;
        double y;
        x = Integer.parseInt(strInt);
        y = Double.parseDouble(strDouble);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        strInt = String.valueOf(x + 1);
        strDouble = String.valueOf(y + 1);
        System.out.println("StrInt=" + strInt);
        System.out.println("StrDouble=" + strDouble);
        String str;
        str = "num" + 345;
        System.out.println(str);
    }
}