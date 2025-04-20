import java.util.*;

public class Discord{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] set=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				set[i][j]=0;
			}
		}
		int sum=n*(n-1)/2;
		for(int i=0;i<m;i++){
			int left=sc.nextInt();
			for(int j=0;j<n-1;j++){
				int right=sc.nextInt();
				set[left-1][right-1]=1;
				set[right-1][left-1]=1;
				left=right;
			}
		}
		int count=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(set[i][j]==1){
					count++;
				}
			}
		}
		int result=sum-(count/2);
		System.out.print(result);
	}
}