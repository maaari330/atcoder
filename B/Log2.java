import java.util.*;
import java.math.*;

public class Log2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String nn=sc.next();
        BigInteger n=new BigInteger(nn);

        List<BigInteger> list=new ArrayList<>();
        String twoo="2";
        BigInteger two=new BigInteger(twoo);
        for(int i=0;i<60;i++){
            BigInteger temp=two.pow(i);
            list.add(temp);
        }
        for(int i=0;i<60;i++){
            int result=list.get(i).compareTo(n);
            if(result==0){
                System.out.print(i);
                return;
            }
            else if(result>0){
                System.out.print(i-1);
                return;
            }
        }
        System.out.println(59);
    }
}