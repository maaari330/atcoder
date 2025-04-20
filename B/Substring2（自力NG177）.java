import java.util.*;

public class Substring2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        System.out.print(minChange(s,t));       
            
    }

    private static int minChange(String s,String t){
        int lenS=s.length();
        int lenT=t.length();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=lenS-lenT;i++){
            int count=0;
            for(int j=0;j<lenT;j++){
                if(s.charAt(i+j)!=t.charAt(j)){
                    count++;
                }
            }
            min=Math.min(min,count);
        }
        return min;
    } 
}