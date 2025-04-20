import java.util.*;

public class REAdjacencyList{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<Integer>[] ab=new ArrayList[n+1];
        for(int i=0;i<n+1;i++){
            ab[i]=new ArrayList<>();
        }
        for(int i=0;i<m;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            ab[a].add(b);
            ab[b].add(a);
        }
        for(int i=1;i<n+1;i++){
            System.out.print(ab[i].size()+" ");
            if(ab[i].size()!=0){
                Collections.sort(ab[i]);
                for(int j=0;j<ab[i].size();j++){
                    System.out.print(ab[i].get(j)+" ");
                }
            }
            System.out.println();
        }
    }
}