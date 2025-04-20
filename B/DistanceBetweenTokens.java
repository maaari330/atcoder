import java.util.*;

public class DistanceBetweenTokens{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        String[] s=new String[h];
        List<Integer> x=new ArrayList<>();
        List<Integer> y=new ArrayList<>();
        for(int i=0;i<h;i++){
            s[i]=sc.next();
            for(int j=0;j<s[i].length();j++){
                if(s[i].charAt(j)=='o'){
                    x.add(i);
                    y.add(j);
                }
            }
        }

        System.out.print(Math.abs(x.get(0)-x.get(1))+Math.abs(y.get(0)-y.get(1)));

    }
}