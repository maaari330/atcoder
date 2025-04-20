import java.util.*;

public class DPawn{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int Q=sc.nextInt();
        int[] mass=new int[n+1];
        int[] curr=new int[k+1];
        for(int i=1;i<=k;i++){
            int a=sc.nextInt();
            mass[a]=1;
            curr[i]=a;
        }
        for(int i=0;i<Q;i++){
            int q=sc.nextInt();
            int next=curr[q]+1;
            if(next<n+1 && mass[next]==0){
                mass[next]=1;
                mass[curr[q]]=0;
                curr[q]+=1;
            }
        }
        for(int i=1;i<curr.length;i++){
            System.out.print(curr[i]+" ");
        }

    }

}