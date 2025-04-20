import java.util.Scanner;

public class Nutrients{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] a=new int[m];
		int[][] x=new int[n][m];
		for(int i=0;i<m;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				x[i][j]=sc.nextInt();
			}
		}
		boolean result=true;
		int temp=0;
		for(int j=0;j<m;j++){
			for(int i=0;i<n;i++){
				temp+=x[i][j];
			}
			if(temp<a[j]){
				result=false;
			}
			temp=0;
		}
		if(result){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}