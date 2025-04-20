import java.util.*;

public class Prefixx{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		if(t.startsWith(s)){
			System.out.print("Yes");
			return;
		}
		else{
			System.out.print("No");
		}
	}
}