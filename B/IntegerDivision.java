import java.util.*;
import java.math.*;

public class IntegerDivision{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String x=sc.next();
        BigDecimal X=new BigDecimal(x);
        BigDecimal ans=X.divide(BigDecimal.TEN);
        if(ans.compareTo(BigDecimal.ZERO)==-1){
            BigDecimal ANS=ans.setScale(0,RoundingMode.UP);
            System.out.print(ANS.toString());
        }
        else{
            BigDecimal ANS=ans.setScale(0,RoundingMode.DOWN);
            System.out.print(ANS.toString());
        }
        
    }
}