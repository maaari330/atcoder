import java.util.Scanner;

public class Elect{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=sc.nextInt();
		int a=sc.nextInt();
		
		if((n%2==1)&& n>=1 && n<=99 && 0<=t && 0<=a && t<=n && a<=n && (t+a)<=n){
			int bound=(n+1)/2;
			
			if(t>=bound){
				System.out.println("Yes");
			}
			else if(a>=bound){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}
	}
}