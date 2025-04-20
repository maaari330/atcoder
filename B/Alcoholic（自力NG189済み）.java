import java.util.*;

public class Alcoholic{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int xx=sc.nextInt();
        int x=xx*100;
        int[] v=new int[n];
        int[] p=new int[n];
        for(int i=0;i<n;i++){
            v[i]=sc.nextInt();
            p[i]=sc.nextInt();
        }
        int alc=0;
        for(int i=0;i<n;i++){
            alc+=v[i]*p[i];
            if(alc>x){
                System.out.print(i+1);
                return;
            }
        }
        System.out.print(-1);
    }
}