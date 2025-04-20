import java.util.Scanner;
import java.util.ArrayList;

public class AdjacentProduct{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		ArrayList<Integer> b=new ArrayList<Integer>();
		
		if(n>=2&&n<=100){
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
				}
			
			for(int i=0;i<=n-2;i++){
				b.add(a[i]*a[i+1]);
			}
			
			for(int i=0;i<b.size();i++){
				System.out.print(b.get(i)+" ");
			}
		}
	}
}
		