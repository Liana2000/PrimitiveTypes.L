package New;

public class LogicalOperators {
    public static void main(String[] args) {
        //&& operator
        int x = 10;
        int y = 5;
        int z = 20;
        if (x < y && x++ > z) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        //|| operator
        int q=13;
        int w=16;
        if (q>w || w++<q){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        //###
        boolean c=true;
        boolean b=false;
        System.out.println("b="+!b);

        boolean r=true;
        boolean r1=true;
        boolean o=false;
        boolean h=r|o;
        boolean i=r^r1;
        boolean e=r&o;
        boolean f1=(!r&o)|(r&!o);
        boolean op=!(r=r1);
        System.out.println("r="+!r);
        System.out.println("o="+o);
        System.out.println("h="+h);
        System.out.println("i="+i);
        System.out.println("e="+e);
        System.out.println("f1="+f1);
        System.out.println("op="+op);

        int oo=15;
        int oo3=15;
        int oo1=16;
        if (oo==oo3 && ++oo==oo1){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
    }



