import java.util.*;

public class GoodDistance{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int[][] ten=new int[n][d];
        for(int i=0;i<n;i++){
            for(int j=0;j<d;j++){
                ten[i][j]=sc.nextInt();
            }
        }

        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                double distance=0;
                for(int k=0;k<d;k++){
                    distance+=Math.pow(ten[i][k]-ten[j][k],2);
                }
                distance=Math.sqrt(distance);
                if(distance==(int)distance){
                    count++;
                }
            }
        }
        System.out.print(count);

    }
}