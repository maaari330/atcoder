import java.util.Scanner;

public class Cut{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] a=new int[n];
		
		int[] b=new int[n];
		int rear=0;
		
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		if(1<=n && n<=100 && 1<=k && k<=100){
			for(int i=n-k;i<n;i++){
				b[rear]=a[i];
				rear++;
			}
			
			for(int i=0;i<n-k;i++){
				b[rear]=a[i];
				rear++;
			}
			
			for(int i=0;i<n;i++){
				System.out.print(b[i]+" ");
			}
		}
		
	}
}