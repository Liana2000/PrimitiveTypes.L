package New;

public class TypeCast {
    public static void main(String[] args) {
        //int to byte
        int x = 12345;
        byte b= (byte) x;
        System.out.println(b);

        //float to double
        float f=12.45f;
        double d= f;
        System.out.println(d);
        System.out.println(f);

        //float cast to integer
        float f1=87.6f;
        int i =(int)f1;
        System.out.println(i);

        //int cast to float
        int f2=56;
        float y = (float) f2;
        System.out.println(y);

        //int cast to double
        int f3=34;
        double d1=(double) f3;
        System.out.println(d1);

        //exact number of float number
        int z=5;
        float z1 = (float) z;
        int j=4;
        float result =  z1/j;
        System.out.println("result:"+ result);

        //exact number of double number
        int q=125;
        double q3=(double) q;
        int q1=65;

        //double q4=(double) q1;
        double result1=q/q1;
        System.out.println("result1:"+ result1);
//exact number of  float number
        int p=4, r=3;
        float t;
        System.out.println((float) p/r);
        System.out.println(p/(float)r);
        System.out.println((float) (p/r));



    }
}
