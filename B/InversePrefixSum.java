import java.util.*;

public class InversePrefixSum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] s=new int[n];
		for(int i=0;i<n;i++){
			s[i]=sc.nextInt();
		}
		System.out.print(s[0]+" ");
		for(int i=1;i<n;i++){
			System.out.print(s[i]-s[i-1]+" ");
		}
	}
}