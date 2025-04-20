import java.util.*;
import java.math.*;

public class Multiplication2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long result=1;
        long eighteen=(long)Math.pow(10,18);
        long[] a=new long[n];

        for(int i=0;i<n;i++){
            long aa=sc.nextLong();
            if(aa==0){
                System.out.print(0);
                return;
            }
            a[i]=aa;
        }
        
        for(int i=0;i<n;i++){
            if(result>eighteen/a[i]){
                System.out.print(-1);
                return;
            }
            result*=a[i];
        }
        System.out.print(result);
    }
}