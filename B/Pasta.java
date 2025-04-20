import java.util.*;

public class Pasta{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] a=new int[n];
        int[] done=new int[n];
        int[] b=new int[m];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(done[j]==0&&a[j]==b[i]){
                    done[j]=1;
                    count++;
                    break;
                }
            }
        }
        System.out.print(count==m?"Yes":"No");
    }
}