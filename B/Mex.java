import java.util.*;

public class Mex{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] A=new int[2001];
        for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            A[temp]=1;
        }
        for(int i=0;i<=2000;i++){
            if(A[i]==0){
                System.out.print(i);
                return;
            }
        }
    }
}