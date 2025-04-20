import java.util.*;

public class PerfectString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        List<Character> list=new ArrayList<>();
        if(s.matches(".*[a-z].*")&&s.matches(".*[A-Z].*")){ 
            for(char c:s.toCharArray()){
                if(list.contains(c)){
                    System.out.print("No");
                    return;
                }
                list.add(c);
            }
            System.out.print("Yes");
        }
        else{
            System.out.print("No");

        }
    }
}