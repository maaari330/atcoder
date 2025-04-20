import java.util.*;

public class Lookup{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		if(s.contains(t)){
			System.out.print("Yes");
		}
		else{
			System.out.print("No");
		}
	}
}