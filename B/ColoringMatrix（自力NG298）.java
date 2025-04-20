import java.util.*;

public class ColoringMatrix{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] a=new int[n][n];
		int[][] b=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				b[i][j]=sc.nextInt();
			}
		}
		boolean result=false;
		for(int k=0;k<4;k++){
			if(isMatching(a,b)){
				result=true;
				break;
			}
			rotate(a);
		}
		System.out.print(result?"Yes":"No");
	}
		
		
	private static boolean isMatching(int[][] a,int[][] b){
		int n=a.length;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(a[i][j]==1&&b[i][j]!=1){
					return false;
				}
			}
		}
		return true;
	}
	
	private static void rotate(int[][] a){
		int n=a.length;
		int[][] temp=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				temp[j][n-1-i]=a[i][j];
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				a[i][j]=temp[i][j];
			}
		}
	}

}