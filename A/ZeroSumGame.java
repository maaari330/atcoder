import java.util.Scanner;

public class ZeroSumGame{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int result=0;
		
		if(n>=2 && n<=100){
			for(int i=0;i<n-1;i++){
				a=a+sc.nextInt();
			}
			
			result=-a;
			System.out.println(result);
		}
	}
}