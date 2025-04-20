import java.util.*;

public class HitAndBlow{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        int count1=0;
        int count2=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j&&a[i]==b[j]){
                    count1++;
                }
                if(i!=j&&a[i]==b[j]){
                    count2++;
                }
            }
        }
        System.out.println(count1);
        System.out.print(count2);
    }
}