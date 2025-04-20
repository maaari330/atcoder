import java.util.Scanner;

public class Print341{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n>=1 && n<=100){
			for(int i=0;i<n;i++){
				System.out.print("10");
			}
			System.out.println("1");
		}
	}
}
				