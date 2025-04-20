import java.util.*;

public class MinimizeOrdering{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] c=new char[s.length()];
        for(int i=0;i<s.length();i++){
            c[i]=s.charAt(i);
        }
        Arrays.sort(c);
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]);
        }
    }
}