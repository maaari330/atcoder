import java.util.*;

public class PowerSocket{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int tap=0;
        int kuti=1;
        while(kuti<b){
            tap++;
            kuti+=a-1;
        }
        System.out.print(tap);
    }
}