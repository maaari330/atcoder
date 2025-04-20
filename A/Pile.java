import java.util.Scanner;

public class Pile{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		
		int rest=0;
		
		if(r>=1 && r<=299){
			rest=100-r%100;
			System.out.println(rest);
		}
	}
}