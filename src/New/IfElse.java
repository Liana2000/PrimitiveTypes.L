package New;

public class IfElse {
    public static void main(String[] args) {


        int x = 5;
        int z = 15;
        if (x != z)
            System.out.println("true");
        else
            System.out.println("false");
        //####################
        int x1 = 5;
        int z1 = 15;
        if (x1 < z1)
            System.out.println("false");
        else
            System.out.println("true");
        System.out.println("true.true");//the output will be FALSE and TRUE.TRUE
        //****************
        int w = 50;
        int r = 100;
        if (w > r) {
            System.out.println("50e mec che 100 ic");
        } else {
            System.out.println("50 e poqr e 100 ic");
            System.out.println("this statement is true");
        }
        //---------------------------
        if (67 > 89)
            if (89 > 90)
                if (9 < 10)
                    System.out.println("no");
                else
                    System.out.println("yes"); //why does not give the output?
        //_____________________________
        if (89 > 90 || 90 > 89)
            if (91 > 90 && 34 > 65)
                System.out.println("90>89");
            else
                System.out.println("34>33");

        //max  value variant 1
        int x2 = 2, y2 = 37, z2 = -100, p2 = 103;
        if (x2 >= y2 && x2 >= z2) {
            System.out.println("max numbers is:" + y2);
        } else if (y2 <= z2 && z2 >= y2) {
            System.out.println("max number is:" + y2);
        } else {
            System.out.println("Max number is:" + p2);
        }
        //max value variant 2
        int max=x2;
        if (x2<y2){
            max = y2;
        }
        if (y2<z2){
            max =z2;
        }
        if (z2<p2){
            max=p2;
            System.out.println("max number is:"+ max);
        }
        //min value variant 1
        if (x2 <= y2 && x2 <= z2) {
            System.out.println("min number is:" + x2);
        } else if (y2 >= z2 && p2 >= z2) {
            System.out.println("min number is:" + z2);
        } else {
            System.out.println("min number is:" + y2);
        }
        //min value variant 2
        int min=z2;
        if(x2>y2){
            min=x2;
        }
        if(y2<z2){
            min=z2;
        }
        if(z2<p2){
            min=z2;
            System.out.println("min number is:"+z2);
        }
        //unenq 3 hat tiv asel ayd tverov hanravor e erankyuni hashvel te voch
        int t1=14;
        int q1=15;
        int r1=16;
        if(t1+r1>q1&&q1+r1>t1&&t1+q1>r1){
            System.out.println("Get triangle");
        }
        else{
            System.out.println("Can't get triangle");
        }
        // tvi arjekic kaxvac asenq te inch shabat e??

    }
}











