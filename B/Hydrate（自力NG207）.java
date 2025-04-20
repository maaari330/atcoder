import java.util.*;
import java.math.*;

public class Hydrate{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        long c=sc.nextLong();
        long d=sc.nextLong();
        long blue=a,red=0;
        if(c*d-b<=0){
            System.out.print(-1);
            return;
        }
        for(int i=1;i<=a;i++){
            blue+=b;
            red+=c;
            if(blue<=d*red){
                System.out.println(i);
                return;
            }
        }
    }
}