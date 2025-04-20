import java.util.*;

public class Ancestor{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] P=new int[n];
		P[0]=0;
		for(int i=1;i<=n-1;i++){
			P[i]=sc.nextInt()-1;
		}
		int p=P[n-1];
		int count=1;
		while(p!=0){
			p=P[p];
			count++;
		}
		System.out.print(count);
	}
}