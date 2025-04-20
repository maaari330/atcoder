
import java.util.*;

public class LightItUp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] ON=new int[n];
        int[] X=new int[n];
        int[] Y=new int[n];
        for(int i=0;i<k;i++){
            int temp=sc.nextInt();
            ON[temp-1]=1;
        }

        for(int i=0;i<n;i++){
            X[i]=sc.nextInt();
            Y[i]=sc.nextInt();
        }

        double[][] dist=new double[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    dist[i][j]=Math.pow(10,13);
                }
                else{
                    dist[i][j]=Math.sqrt(Math.pow(Math.abs(X[i]-X[j]),2)+Math.pow(Math.abs(Y[i]-Y[j]),2));
                }
            }
        }
        
        double[] min=new double[n];
        for(int i=0;i<n;i++){
            if(ON[i]==0){
                double MIN=Math.pow(10,13);
                for(int j=0;j<n;j++){
                    if(ON[j]==1){
                        MIN=Math.min(MIN,dist[i][j]);
                    }
                }
                min[i]=MIN;
            }
        }

        double MAX=Arrays.stream(min).max().getAsDouble();
        System.out.print(MAX);
    }
}