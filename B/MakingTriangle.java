import java.util.*;

public class MakingTriangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] l=new int[n];
        for(int i=0;i<n;i++){
            l[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(l[i]!=l[j]&&l[j]!=l[k]&&l[i]!=l[k]&&l[i]+l[j]>l[k]&&l[i]+l[k]>l[j]&&l[k]+l[j]>l[i]){
                        count++;
                    }
                }
            }
        }
        System.out.print(count);
    }
}