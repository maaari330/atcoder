import java.util.Scanner;

public class Ninths{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=0;
		int b=0;
		
		for(int i=0;i<9;i++){
			a=a+sc.nextInt();
		}
		for(int i=0;i<8;i++){
			b=b+sc.nextInt();
		}
		
		int gap=a-b;
		
		System.out.println(gap+1);
	}
}
		