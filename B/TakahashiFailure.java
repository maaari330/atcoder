import java.util.*;

public class TakahashiFailure{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[k];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=Arrays.stream(a).max().getAsInt();
        for(int j=0;j<k;j++){
            b[j]=sc.nextInt();
            if(a[b[j]-1]==max){
                System.out.print("Yes");
                return;
            }
        }
        System.out.print("No");
    }
}