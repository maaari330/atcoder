import java.util.Scanner;

public class OnlineShopping{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(), s=sc.nextInt(), k=sc.nextInt();
		int sum=0;
		
		if(n<=100 && n>=1){
			for(int i=0;i<n;i++){
				int p=sc.nextInt(),q=sc.nextInt();
				sum=sum+p*q;
			}
			if(sum<s){
				sum=sum+k;
			}
			System.out.println(sum);
		}
		
	}
}