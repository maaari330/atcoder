import java.util.*;

public class SandwichNumber{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		boolean result=true;
		
		if(s.length()!=8){
			System.out.print("No");
			return;
		}
		
		for(int i=0;i<s.length();i++){
			if(i==0||i==s.length()-1){
				if(!Character.isUpperCase(s.charAt(i))){
					System.out.print("No");
					return;
				}
			}
			else if(Character.isUpperCase(s.charAt(i))){
				System.out.print("No");
				return;
			}
		}
		s=s.substring(1,s.length()-1);
		int n=Integer.parseInt(s);
		if(n<100000||n>=1000000){
			System.out.print("No");
			return;
		}
		System.out.print("Yes");
	}
}