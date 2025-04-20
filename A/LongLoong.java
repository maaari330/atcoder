import java.util.Scanner;

public class LongLoong{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>=1 && n<=2024){
			System.out.print("L");
			for(int i=0;i<n;i++){
				System.out.print("o");
			}
			System.out.print("ng");
		}
	}
}