import java.util.*;
import java.lang.Math;
class areas
{
    public static void main(String args[])
    {
        float a,b,c;
        double s,ar;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        s=(a+b+c)/2;
        ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",ar);
    }
}