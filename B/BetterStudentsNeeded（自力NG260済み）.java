import java.util.*;
import java.util.Map.Entry;

public class BetterStudentsNeeded{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        Map<Integer,Integer> math=new TreeMap<>();
        Map<Integer,Integer> eng=new TreeMap<>();
        Map<Integer,Integer> total=new TreeMap<>();
        for(int i=1;i<=n;i++){
            math.put(i,sc.nextInt());
        }
        for(int i=1;i<=n;i++){
            eng.put(i,sc.nextInt());
        }
        for(int i=1;i<=n;i++){
            total.put(i,math.get(i)+eng.get(i));
        }
        List<Map.Entry<Integer, Integer>> MATH= new ArrayList<>(math.entrySet());
        MATH.sort((entry1,entry2) -> Integer.compare(entry2.getValue(),entry1.getValue()));
        List<Map.Entry<Integer, Integer>> ENG= new ArrayList<>(eng.entrySet());
        ENG.sort((entry1,entry2) -> Integer.compare(entry2.getValue(),entry1.getValue()));
        List<Map.Entry<Integer, Integer>> TOTAL= new ArrayList<>(total.entrySet());
        TOTAL.sort((entry1,entry2) -> Integer.compare(entry2.getValue(),entry1.getValue()));

        int[] called=new int[n+1];

        int count0=0;
        for(Map.Entry<Integer, Integer> M:MATH){
            if(count0<x){
                called[M.getKey().intValue()]=1;
                count0++;
            }
        }

        int count1=0;
        for(Map.Entry<Integer, Integer> E:ENG){
            if(count1<y){
                if(called[E.getKey().intValue()]==0){
                    called[E.getKey().intValue()]=1;
                    count1++;
                }
            }
        }

        int count2=0;
        for(Map.Entry<Integer, Integer> T:TOTAL){
            if(count2<z){
                if(called[T.getKey().intValue()]==0){
                    called[T.getKey().intValue()]=1;
                    count2++;
                }
            }
        }

        for(int i=1;i<=n;i++){
            if(called[i]==1){
                System.out.println(i);
            }
        }
    }
}