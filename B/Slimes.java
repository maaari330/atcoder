import java.util.*;

public class Slimes{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int k=sc.nextInt();
        
        if(a>=b){
            System.out.print(0);
            return;
        }
        double cur=a;
        int count=0;
        while(cur<b){
            count++;
            cur=a*Math.pow(k,count);
        }
        System.out.print(count);
    }
}