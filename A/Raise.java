import java.util.Scanner;

public class Raise{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String l=sc.next();
		String r=sc.next();
		
		if((l.equals("0") || l.equals("1")) && (r.equals("0") || r.equals("1"))){
			if(l.equals("0") && r.equals("1")){
				System.out.println("No");
			}
			else if(l.equals("1") && r.equals("0")){
				System.out.println("Yes");
			}
			else{
				System.out.println("Invalid");
			}
		}
	}
}