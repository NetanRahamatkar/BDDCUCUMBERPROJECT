package src.programs;

public class StaticKeyword {

    //static variable

    static int a = 10;
    static int b;

    //static block

    static {
        System.out.println("static block initialized.");
        b = a * 4;
    }


    public static void main(String[] args) {
        System.out.println("from main");
        System.out.println("value fo a :" + a);
        System.out.println("Value of b :"  + b);
    }
}
