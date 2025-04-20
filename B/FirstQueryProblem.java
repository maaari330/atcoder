import java.util.*;

public class FirstQueryProblem{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int q=sc.nextInt();
		for(int i=0;i<q;i++){
			int type=sc.nextInt();
			int k=sc.nextInt();
			if(type==1){
				int x=sc.nextInt();
				a[k-1]=x;
			}
			else{
				System.out.println(a[k-1]);
			}
		}
	}
}