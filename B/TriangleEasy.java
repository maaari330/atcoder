import java.util.*;

public class TriangleEasy{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] HEN=new int[n+1][n+1];
		for(int i=0;i<=n;i++){
			for(int j=0;j<=n;j++){
				HEN[i][j]=0;
			}
		}
		for(int i=0;i<m;i++){
			int u=sc.nextInt();
			int v=sc.nextInt();
			HEN[u][v]=1;
		}
		int count=0;
		for(int i=0;i<=n;i++){
			List<Integer> ten=new ArrayList<>();
			for(int j=0;j<=n;j++){
				if(HEN[i][j]==1){
					ten.add(j);
				}
			}
			
			for(int j=0;j<ten.size();j++){
				for(int k=j;k<ten.size();k++){
					int u=ten.get(j);
					int v=ten.get(k);
					if(HEN[u][v]==1){
						count++;
					}
				}
			}
		}
		System.out.print(count);
	}
}