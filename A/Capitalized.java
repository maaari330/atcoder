import java.util.Scanner;

public class Capitalized{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		boolean result=true;
		
		if(s.length()>=1 && s.length()<=100){
			if(Character.isUpperCase(s.charAt(0))){
				for(int i=1;i<s.length();i++){
					if(Character.isUpperCase(s.charAt(i))){
						result=false;
						break;
					}
				}
			}
			else{
				result=false;
			}
			
			if(result==false){
				System.out.println("No");
			}
			else{
				System.out.println("Yes");
			}
		}
		
	}
}