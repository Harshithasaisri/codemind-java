import java.util.*;
import java.lang.Math;
class area
{
    public static void main(String args[])
    {
        float a,b,c;
        double ar;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        double s=(a+b+c)/2;
        ar=(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",Math.sqrt(ar));
    }
}