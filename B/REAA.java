import java.util.*;

public class REAA{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long b=sc.nextLong();

        for(int i=1;i<=15;i++){
            long a=1;
            for(int j=0;j<i;j++){
                a*=i;
            }
            if(a==b){
                System.out.print(i);
                return;
            }
        }
        System.out.print(-1);
        
    }
}