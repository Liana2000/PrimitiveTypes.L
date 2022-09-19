package New;

public class iii {
    public static void main(String[] args) {
        int x = 111;
        System.out.println(++x);

        int y = 11;
        ++y;
        y++;
        System.out.println(++y);

        int z = 133;
        ++z;
        ++z;
        System.out.println(z++);//skzbum chi tpi hajord qaylin nor ktpi
        System.out.println(z++);

        int w =12;
        System.out.println((w++ + w++));

        int v=12;
        System.out.println((++v + ++v));

//        double d = 2.11 + 2;
//        System.out.println(d);
//        float f1 = 2.11f + 2; //Didn't get where is the logic?
//        System.out.println(f1);

//        int x = 2;
//        x = 4;
//        x = 6;
//        System.out.println(x);
//        int y = 10;
//        float z = x / (x + y);
//        System.out.println(z);
//        double q = x / (x + y);//Why the output is the same as it is in case of float?
//        System.out.println(q);


    }
}
