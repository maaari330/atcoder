import java.util.*;

public class EnlargedCheckerBoard{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        char[][] black=new char[a][b];
        char[][] white=new char[a][b];

        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                black[i][j]='#';
                white[i][j]='.';
            }
        }
        char[][][][] s=new char[n][n][][];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i%2==0&&j%2==0||i%2==1&&j%2==1){
                    s[i][j]=white;
                }
                else{
                    s[i][j]=black;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<a;j++){
                for(int k=0;k<n;k++){
                    for(int l=0;l<b;l++){
                        System.out.print(s[i][k][j][l]);
                    }
                }
                System.out.println();
            }
        }
    }
}