import java.util.*;

public class CountingArrays{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<List<Integer>> a=new HashSet<>();
        for(int i=0;i<n;i++){
            int l=sc.nextInt();
            List<Integer> A=new ArrayList<>();
            for(int j=0;j<l;j++){
                int aa=sc.nextInt();
                A.add(aa);
            }
            a.add(A);
            }
        System.out.print(a.size());
    }
}