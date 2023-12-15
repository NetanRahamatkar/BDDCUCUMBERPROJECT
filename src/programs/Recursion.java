package src.programs;

public class Recursion {
    //In Java Recursion is a Process in which function call itself directly or Indirectly

    int fact(int n)
    {

        if(n <= 1)  // base case
            return 1;
        else
            return n*fact(n - 1);
    }
}
