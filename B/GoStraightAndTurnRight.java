import java.util.*;

public class GoStraightAndTurnRight{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String t=sc.next();
        int[] x={1,0,-1,0};
        int[] y={0,-1,0,1};
        int curX=0;
        int curY=0;
        int X=0;
        int Y=0;
        for(int i=0;i<n;i++){
            if(t.charAt(i)=='S'){
                X+=x[curX];
                Y+=y[curY];
            }
            else{
                if(curX==3&&curY==3){
                    curX=0;
                    curY=0;
                }
                else{
                    curX++;
                    curY++;
                }
            }
        }
        System.out.print(X+" "+Y);
    }
}