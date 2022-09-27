package New;

public class CharacterLiterals {
    public static void main(String[] args) {
        //System.out.println('\011');
        // System.out.println('\u0011');
        System.out.println('\u0561');//hexadecimal char -16akan
        System.out.println('\u0663');
        System.out.println('\042');
        System.out.println('\043');
        char ch = 100;
        System.out.println("ch is: " + ch);
        byte i = (byte) ch;
        System.out.println("i is:" + i);

        char ch1 = 102;
        System.out.println("ch1 is: " + ch1);

        System.out.println('\144');//Decimal char -8 akan {
        System.out.println('\u0264');

        int a = 66;
        char ch2 = (char) a;
        System.out.println(ch2);

        System.out.println('\ua432');

        int w = 0XA432;
        System.out.println(w);

        char ch5 = 42034;
        System.out.println(ch5);

        int L = 0XF121;
        System.out.println(L);

        System.out.println(024);
        System.out.println('\u0014'); //why does not print?
        System.out.println(0X24);
        //There is no any issue but it's does not print, why?
         int b=33;
         char chch=(char)b;
         System.out.println("chch is: "+ chch);

        System.out.println("he\bllo\b");
        System.out.println("hell\to");
        System.out.println("HIIII\nIII");
        System.out.println("Hell\ro");
        System.out.println("A\"BBB\"CCC\"D");

        int x = 2;
        x = 4;
        x = 6;
        System.out.println(x);
        int y = 10;
        float z = x / (x + y);
        System.out.println("z is: " + z);
        double q = x / (x + y);//Why the output is the same as it is in case of float?
        System.out.println("q is: "+ q);

        int l = 2 + 2;
        int l1 = l * 4;
        int l2 = l1 / 2;
        int l3 = l2 / l1;
        int l4 = l1 % 10;
        System.out.println("l = " + l);
        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);
        System.out.println("l3 = " + l3);
        System.out.println("l4 = " + l4);

        double d = 2.11 + 2;
        System.out.println("d is:" + d);
        float f1 = 2.11f + 2; //Didn't get where is the logic?
        System.out.println("F1 is:" + f1);

        int v = 1;
        float vv = 1.1f;
        double vv1 = v + vv;
        System.out.println(vv1);
        float vv2 = v + vv;
        System.out.println(vv2);

        int v22 = 14;
        int v2 = 96;
        float vv0 = v / v22;
        System.out.println(vv0);
        double vv3 = v / v22;
        System.out.println(vv3);

        int xxx = 19;
        double yyy = 10.0;
        double fff = xxx / yyy;
        System.out.println(fff);
        double ddd = xxx / yyy;
        System.out.println(ddd);

        int xx = 19;
        float yy = 10.0f;
        float ii = xx / yy;
        System.out.println(ii);
        double dd = xx / yy;
        System.out.println(dd);
// % Modulus
        int an = 10;
        int an1 = 3;
        System.out.println(an % an1);

        int y11 = 100;
        float y111 = (float) y11;
        System.out.println(y111);
        double d111 = (double) y111;
        System.out.println(d111);

        int k = 5;
        k = k++;
        System.out.println(k);
        k = k + k++;
        System.out.println(k);

        int j = 2;
        j = ++j;
        System.out.println(j);
        j = j + j++;
        System.out.println(j);

        byte q1 = 127;
        q1 += 1;
        System.out.println(q1);
        // byte q2 = Byte.MAX_VALUE+1;
        // System.out.println(q2);

        int io = 1;
        int io2 = 2;
        int io3;
        int io4;
        io3 = ++io2;
        io4 = io++;
        System.out.println(io4);
        System.out.println(io3);

        int c = 15;
        c += 22;
        System.out.println(c);
        c -= 2;
        c /= 3;
        float cy = (float) c;
        System.out.println(cy);

        byte bb=20;
        bb+=10;
        bb%=9;
        System.out.println("bb is " + bb);


    }
}
