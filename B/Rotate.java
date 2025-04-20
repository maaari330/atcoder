import java.util.*;

public class Rotate{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char[][] a=new char[n][n];
		for(int i=0;i<n;i++){
			String s=sc.next();
			for(int j=0;j<n;j++){
				a[i][j]=s.charAt(j);
			}
		}
		char next='0';
		for(int i=0;i<n;i++){
			if(i==0){
				next=a[0][i];
			}
			else{
				char temp=a[0][i];
				a[0][i]=next;
				next=temp;
			}
		}
		for(int i=1;i<n;i++){
			char temp=a[i][n-1];
			a[i][n-1]=next;
			next=temp;
		}
		for(int i=n-2;i>=0;i--){
			char temp=a[n-1][i];
			a[n-1][i]=next;
			next=temp;
		}
		for(int i=n-2;i>=0;i--){
			char temp=a[i][0];
			a[i][0]=next;
			next=temp;
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}