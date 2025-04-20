import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class MinimizeAbs1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int l=sc.nextInt();
		int r=sc.nextInt();
		int[] a=new int[n];
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++){
			int xi=0;
			if(a[i]<=l){
				xi=l;
			}
			else if(a[i]>=r){
				xi=r;
			}
			else{
				xi=a[i];
			}
			System.out.print(xi+" ");
		}
	}
}