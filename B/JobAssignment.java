import java.util.*;

public class JobAssignment{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        int min=10000000;

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int temp=0;
                if(i==j){
                    temp=a[i]+b[j];
                }
                else{
                    temp=Math.max(a[i],b[j]);
                }
                min=Math.min(min,temp);
            }
        }
        System.out.print(min);
    }
}