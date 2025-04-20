import java.util.Scanner;

public class ForeignExchange{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long[] a=new long[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextLong();
		}
		for(int i=0;i<n-1;i++){
			long s=sc.nextLong();
			long t=sc.nextLong();
			a[i+1]+=a[i]/s*t;
		}
		
		System.out.println(a[n-1]);
	}
}