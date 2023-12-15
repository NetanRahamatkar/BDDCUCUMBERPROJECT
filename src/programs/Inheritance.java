package src.programs;

public class Inheritance {

float salary = 4000;
}

class programmer extends Inheritance{
    int bonous = 1000;

    public static void main(String[] args) {
        programmer p = new programmer();
        System.out.println(p.bonous);
        System.out.println(p.salary);

    }
}
