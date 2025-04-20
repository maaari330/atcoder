import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ExtendedABC{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Pattern p1=Pattern.compile("A*B*C*");
		Matcher matcher=p1.matcher(s);
		if(matcher.matches()){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}