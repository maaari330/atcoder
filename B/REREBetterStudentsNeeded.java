import java.util.*;

public class REREBetterStudentsNeeded{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int[][] abc=new int[n][4];
        for(int i=0;i<n;i++){
            abc[i][0]=i;
            abc[i][1]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            abc[i][2]=sc.nextInt();
            abc[i][3]=abc[i][1]+abc[i][2];
        }

        Set<Integer> result=new HashSet<>();
        var A=Arrays.copyOf(abc,abc.length);
        var B=Arrays.copyOf(abc,abc.length);
        var C=Arrays.copyOf(abc,abc.length);
        Arrays.sort(A,(a,b)-> -Integer.compare(a[1],b[1]));
        Arrays.sort(B,(a,b)-> -Integer.compare(a[2],b[2]));
        Arrays.sort(C,(a,b)-> -Integer.compare(a[3],b[3]));

        for(int i=0;i<x;i++){
            result.add(A[i][0]);
        }
        for(int i=0;i<y;i++){
            if(!result.contains(B[i][0])){
                result.add(B[i][0]);
            }
            else{
                y++;
            }
        }
        for(int i=0;i<z;i++){
            if(!result.contains(C[i][0])){
                result.add(C[i][0]);
            }
            else{
                z++;
            }
        }
        List<Integer> list=new ArrayList<>(result);
        list.sort(Comparator.naturalOrder());
        for(int k:list){
            System.out.println(k+1);
        }
    }
}