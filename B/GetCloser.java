import java.util.*;

public class GetCloser{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double r=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.print(a/r+" "+b/r);
    }
}