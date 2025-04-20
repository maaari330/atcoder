import java.util.Scanner;

public class GarbageCollection{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] q=new int[n], r=new int[n];
		int t=0,d=0;
		
		for(int i=0;i<n;i++){
			q[i]=sc.nextInt();
			r[i]=sc.nextInt();
		}
		int Q=sc.nextInt();
		
		for(int i=0;i<Q;i++){
			t=sc.nextInt();
			d=sc.nextInt();
			t--;
			int c=d%q[t], b=d/q[t];
			if(r[t]>=c){
				System.out.println(b*q[t]+r[t]);
			}
			else{
				System.out.println((b+1)*q[t]+r[t]);
			}
		}
	}
}