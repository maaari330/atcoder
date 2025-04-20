import java.util.*;

public class CounterDetection{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double d=sc.nextDouble();
        double r=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));

        double theta=Math.atan2(b,a);
        theta+=Math.toRadians(d);

        double x=Math.cos(theta)*r;
        double y=Math.sin(theta)*r;

        System.out.println(x+" "+y);

    }
}