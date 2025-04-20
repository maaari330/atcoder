import java.util.*;

public class REAlcoholic{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long x=sc.nextLong();
        x*=100l;
        long alc=0;
        for(int i=1;i<=n;i++){
            long v=sc.nextLong();
            long p=sc.nextLong();
            alc+=v*p;
            if(alc>x){
                System.out.print(i);
                return;
            }
        }
        System.out.print(-1);
    }
}