import java.util.Scanner;

public class ThreeThrees{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n>=1 && n<=9){
			for(int i=0;i<n;i++){
				System.out.print(n);
			}
		}
		
	}
}