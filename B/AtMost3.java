import java.util.*;

public class AtMost3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int w=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int[] W=new int[w+1];
        for(int i=0;i<n;i++){
            if(a[i]<=w){
                W[a[i]]=1;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]+a[j]<=w){
                    W[a[i]+a[j]]=1;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(a[i]+a[j]+a[k]<=w){
                        W[a[i]+a[j]+a[k]]=1;
                    }
                }
            }
        }

        int count=0;
        for(int i=0;i<w+1;i++){
            if(W[i]==1){
                count++;
            }
        }
        System.out.print(count);
    }
}