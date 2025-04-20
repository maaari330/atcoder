import java.util.*;

public class Billiards{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double sx=sc.nextDouble();
        double sy=sc.nextDouble();
        double gx=sc.nextDouble();
        double gy=sc.nextDouble();
        double sumX=Math.abs(sx-gx);
        double sumY=sy+gy;
        double part=sumX/sumY;
        if(sx<gx){
            System.out.print(sx+part*sy);
        }
        else{
            System.out.print(gx+part*gy);
        }
    }
}