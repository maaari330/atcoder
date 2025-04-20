import java.util.*;

public class REColoringMatrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a=new int[n][n];
        int[][] b=new int[n][n];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
                if(a[i][j]==1){
                    count++;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                b[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<3;i++){
            int[][] aa=new int[n][n];
            int cnt2=0;
            outer:for(int x=0;x<n;x++){
                for(int y=0;y<n;y++){
                    aa[n-1-y][x]=a[x][y];
                    if(aa[n-1-y][x]==1&b[n-1-y][x]!=1){
                        break outer;
                    }
                    else if(aa[n-1-y][x]==1&b[n-1-y][x]==1){
                        cnt2++;
                    }
                }
                
            }
            if(count==cnt2){
                System.out.print("Yes");
                return;
            }
            
        }
        System.out.print("No");

    }
    
}
