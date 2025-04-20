import java.util.*;
import java.util.List;

public class EveryoneIsFriend{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] result=new int[n][n];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i==j){
					result[i][j]=1;
				}
				else{
					result[i][j]=0;
				}
			}
		}
		
		for(int i=0;i<m;i++){
			int k=sc.nextInt();
			List<Integer> x=new ArrayList<>();
			for(int j=0;j<k;j++){
				int temp=sc.nextInt();
				temp-=1;
				x.add(temp);
			}
			
			for(int j=0;j<n;j++){
				if(x.contains(j)){
					change1(j,x,result);
				}
			}
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(result[i][j]==0){
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}
	
	private static void change1(int j,List<Integer> x,int[][] result){
		for(int i=0;i<x.size();i++){
			result[x.get(i)][j]=1;
			result[j][x.get(i)]=1;
		}
	}
}
