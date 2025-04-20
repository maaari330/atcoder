import java.util.*;

public class MissingNo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<n-1;i++){
			int j=i+1;
			if(a[j]!=a[i]+1){
				System.out.println(a[i]+1);
				break;
			}
		}
	}
}