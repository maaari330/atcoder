import java.util.Scanner;

public class Correct3{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=String.valueOf(n);
		
		String a=String.valueOf(s.charAt(0));
		String b=String.valueOf(s.charAt(1));
		String c=String.valueOf(s.charAt(2));
			
		if(111<=n && n<=999 && a!="0" && b!="0" && c!="0"){
			System.out.println(b.concat(c).concat(a)+" "+c.concat(a).concat(b));
		}
	}
}
