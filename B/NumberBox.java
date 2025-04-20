import java.util.*;

public class NumberBox{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] x={0,1,1,1,0,-1,-1,-1};
        int[] y={1,1,0,-1,-1,-1,0,1};
        int[][] A=new int[n][n];
        for(int i=0;i<n;i++){
            String a=sc.next();
            for(int j=0;j<n;j++){
                A[i][j]=Integer.parseInt(String.valueOf(a.charAt(j)));
            }
        }
        long max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<x.length;k++){
                    int dirX=x[k];
                    int dirY=y[k];
                    int curX=i;
                    int curY=j;
                    long calc=0;
                    for(int l=0;l<n;l++){
                        calc+=(long)A[curX][curY]*(long)Math.pow(10,l);
                        if(curX+dirX<0){
                            curX=n-1;
                        }
                        else if(curX+dirX>=n){
                            curX=0;
                        }
                        else{
                            curX+=dirX;
                        }

                        if(curY+dirY<0){
                            curY=n-1;
                        }
                        else if(curY+dirY>=n){
                            curY=0;
                        }
                        else{
                            curY+=dirY;
                        }
                    }
                    max=Math.max(calc,max);
                }
            } 
        }
        System.out.print(max);
    }
}