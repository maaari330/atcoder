import java.util.*;

public class StringShifting{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String S=sc.next();

        Set<String> set=new TreeSet<>();
        String prev=S;
        for(int i=0;i<S.length();i++){
            String temp=prev.substring(1);
            temp+=String.valueOf(prev.charAt(0));
            set.add(temp);
            prev=temp;
        }

        String before=S;
        for(int i=0;i<S.length();i++){
            String temp=String.valueOf(before.charAt(S.length()-1));
            temp+=before.substring(0,S.length()-1);
            set.add(temp);
            before=temp;
        }
        List<String> list=new ArrayList<>(set);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));
    }
}