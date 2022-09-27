package New;

public class BitwiseOperators {
    public static void main(String[] args) {
        //& bitwise operators
        int x=5;
        int y=15;
        System.out.println( x&y);
        //| or bitwise operator
        System.out.println(x|y);
        //XOR operator
        System.out.println(x^y);
        //<<
        System.out.println(x<<y);//00000101<<15
        //>>
        System.out.println(x>>y);////00000101>>15


    }
}
