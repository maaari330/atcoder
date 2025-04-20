import java.util.*;
import java.io.*;

public class RECallTheIDNumber{
    public static void main(String[] args) throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        String s=reader.readLine();
        String[] xx=s.split("\\s+");
        int[] x=new int[n];
        for(int i=0;i<n;i++){
            x[i]=Integer.parseInt(xx[i]);
        }
        List<Integer> list=new ArrayList<>();
        int[] y=new int[n+1];

        for(int i=0;i<n;i++){
            if(y[i+1]==0){
                y[x[i]]=1;
            }
        }
        int count=0;
        for(int i=1;i<=n;i++){
            if(y[i]==0){
                count++;
                list.add(i);
            }
        }
        System.out.println(list.size());
        Collections.sort(list);
        for(int k:list){
            System.out.print(k+" ");
        }
    }
}