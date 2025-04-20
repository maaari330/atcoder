import java.util.*;
import java.math.*;

public class REChristmasTree {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long m=sc.nextLong();
        long l=sc.nextLong()-a;
        long r=sc.nextLong()-a;
        
        System.out.print(Math.floorDiv(r,m)-Math.floorDiv(l-1,m));

    }
}
