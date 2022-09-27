package New;

public class OperatorsJava {
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

        int x1 = 2;
        x1 = 4;
        x1 = 6;
        System.out.println(x);
        int y1 = 10;
        float z1 = x1 / (x1 + y1);
        System.out.println(z);
        double q = x1 / (x1 + y1);//Why the output is the same as it is in case of float?
        System.out.println(q);


    }
}
