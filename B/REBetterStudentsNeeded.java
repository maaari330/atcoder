import java.util.*;
import java.math.*;

public class REBetterStudentsNeeded{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        sc.nextLine();

        Map<Integer,Integer> a=new HashMap<>();
        Map<Integer,Integer> b=new HashMap<>();
        Map<Integer,Integer> c=new HashMap<>();
        for(int i=1;i<=n;i++){
            a.put(i,sc.nextInt());
        }
        for(int i=1;i<=n;i++){
            b.put(i,sc.nextInt());
        }
        for(int i=1;i<=n;i++){
            c.put(i,a.get(i)+b.get(i));
        }

        List<Map.Entry<Integer,Integer>> valueSortA=new ArrayList<>(a.entrySet());
        valueSortA.sort((entry1,entry2) -> entry2.getValue().intValue() - entry1.getValue().intValue());

        List<Map.Entry<Integer,Integer>> valueSortB=new ArrayList<>(b.entrySet());
        valueSortB.sort((entry1,entry2) -> entry2.getValue().intValue() - entry1.getValue().intValue());

        List<Map.Entry<Integer,Integer>> valueSortC=new ArrayList<>(c.entrySet());
        valueSortC.sort((entry1,entry2) -> entry2.getValue().intValue() - entry1.getValue().intValue());

        List<Integer> result=new ArrayList<>();
        int[] called=new int[n+1];
        for(int i=0;i<x;i++){
            int temp=valueSortA.get(i).getKey();
            if(called[temp]!=1){
                result.add(temp);
                called[temp]=1;
            }
            else{
                x+=1;
            }
        }
        for(int i=0;i<y;i++){
            int temp=valueSortB.get(i).getKey();
            if(called[temp]!=1){
                result.add(temp);
                called[temp]=1;
            }
            else{
                y+=1;
            }
        }
        for(int i=0;i<z;i++){
            int temp=valueSortC.get(i).getKey();
            if(called[temp]!=1){
                result.add(temp);
                called[temp]=1;
            }
            else{
                z+=1;
            }
        }
        
        Collections.sort(result);
        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }
    }
}