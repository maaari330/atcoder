import java.util.Scanner;

public class WelcomeLand{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		
		if(s.length()<=10 && t.length()<=10){
			if(s.equals("AtCoder") && t.equals("Land")){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}
	}
}