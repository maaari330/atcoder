import java.util.*;

public class REAncestor{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] p=new int[n+1];
        for(int i=2;i<=n;i++){
            p[i]=sc.nextInt();
        }
        int count=0,temp=1000;
        int j=n;
        while(temp>1){
            temp=p[j];
            count++;
            if(temp==1){
                System.out.print(count);
                return;
            }
            else{
                j=temp;
            }
        }
    }
}