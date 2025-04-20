import java.util.*;

public class StarOrNot{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ab=new int[n];
        for(int i=0;i<n-1;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            ab[a-1]++;
            ab[b-1]++;
        }
        for(int i=0;i<n;i++){
            if(ab[i]==n-1){
                System.out.print("Yes");
                return;
            }
        }
        System.out.print("No");
    }
}