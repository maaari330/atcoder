import java.util.Scanner;

public class ChristmasPresent{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt(), c=sc.nextInt();
		
		if(b>=1 && b<=1000 && c>=1 && c<=1000 && b!=c){
			if(b>c){
				System.out.println("Bat");
			}
			else{
				System.out.println("Glove");
			}
		}
		
	}
}