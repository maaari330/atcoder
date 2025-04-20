import java.util.Scanner;

public class UppercaseAndLowercase{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int upcnt=0,dwncnt=0;
		for(int i=0;i<s.length();i++){
			if(Character.isUpperCase(s.charAt(i))){
				upcnt++;
			}
			else{
				dwncnt++;
			}
		}
		if(upcnt>dwncnt){
			System.out.println(s.toUpperCase());
		}
		else{
			System.out.println(s.toLowerCase());
		}
	}
}