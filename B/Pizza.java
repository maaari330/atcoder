import java.util.*;

public class Pizza{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int sum=0;
        int[] en=new int[361];
        en[0]=1;
        en[360]=1;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(sum+a[i]<360){
                sum+=a[i];
                en[sum]=1;
            }
            else{
                sum=a[i]-(360-sum);
                en[sum]=1;
            }
        }
        int start=0;
        int max=0;
        for(int i=0;i<en.length;i++){
            if(en[i]==1){
                int temp=i-start;
                start=i;
                max=Math.max(max,temp);
            }
        }
        System.out.print(max);
    }
}