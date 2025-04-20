import java.util.*;

public class PrefixAndSuffix{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		String s=sc.next();
		String t=sc.next();
		if(t.startsWith(s)&&t.endsWith(s)){
			System.out.print(0);
		}
		else if(t.startsWith(s)){
			System.out.print(1);
		}
		else if(t.endsWith(s)){
			System.out.print(2);
		}
		else{
			System.out.print(3);
		}
	}
}