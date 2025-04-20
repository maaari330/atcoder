import java.util.Scanner;

public class ArthmeticProgression{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int d=sc.nextInt();
		
		int result=a;
		
		for(int i=0;i<=(b-a)/d;i++){
			System.out.print(result+" ");
			result=result+d;
		}
		
	}
}
