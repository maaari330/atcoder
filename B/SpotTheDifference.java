import java.util.*;

public class SpotTheDifference{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char[][] a=new char[n][n];
		char[][] b=new char[n][n];
		for(int i=0;i<n;i++){
			String s=sc.next();
			for(int j=0;j<n;j++){
				a[i][j]=s.charAt(j);
			}
		}
		for(int i=0;i<n;i++){
			String s=sc.next();
			for(int j=0;j<n;j++){
				b[i][j]=s.charAt(j);
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(a[i][j]!=b[i][j]){
					System.out.println((i+1)+" "+(j+1));
				}
			}
		}
	}
}