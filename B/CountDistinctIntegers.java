import java.util.*;

public class CountDistinctIntegers{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int[] result=Arrays.stream(a).distinct().toArray();
        System.out.print(result.length);
    }
}