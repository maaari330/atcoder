import java.util.Scanner;

public class Divisible{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] a=new int[n];
		
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			if(a[i]%k==0){
				System.out.print(a[i]/k+" ");
			}
		}
	}
}