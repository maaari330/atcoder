import java.util.Scanner;

public class BinaryAlchemy{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(), total=0;
		int[][] a=new int[n][n];
		
		for(int i=0;i<n;i++){
			int j=0;
			while(j<=i){
				a[i][j]=sc.nextInt();
				j++;
			}
		}
		
		int cur=a[0][0];
		int curi=0, curj=0;
		
		for(int i=2;i<=n;i++){
			if(cur>=i){
				cur=a[cur-1][i-1];
				curj=i-1;
			}
			else{
				cur=a[i-1][cur-1];
				curi=i-1;
			}
		}
		System.out.println(cur);
	}
}