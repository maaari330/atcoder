import java.util.*;

public class Mongeness{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        int[][] a=new int[h][w];
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                a[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                for(int k=i+1;k<h;k++){
                    for(int l=j+1;l<w;l++){
                        if(a[i][j]+a[k][l]>a[k][j]+a[i][l]){
                            System.out.print("No");
                            return;
                        }
                    }
                }
            }
        }
        System.out.print("Yes");

    }
}