import java.util.*;

public class ManyOranges{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int w=sc.nextInt();
        int W=w*1000;
        
        int max= (int)Math.floor(W/a);
        int min= (int)Math.ceil(W/b);

        int MAX=0,MIN=1000000;
        boolean result=false;
        for(int i=min;i<=max;i++){
            double temp=(double)W/i;
            if(temp>=(double)a&&temp<=(double)b){
                MAX=Math.max(MAX,i);
                MIN=Math.min(MIN,i);
                result=true;
            }
        }
        if(result){
            System.out.print(MIN+" "+MAX);
        }
        else{
            System.out.print("UNSATISFIABLE");
        }
        
    }
}