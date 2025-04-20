import java.util.Scanner;
import java.util.ArrayList;

public class TLD{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		boolean result=true;
		ArrayList<Character> list=new ArrayList<Character>();
		
		for(int i=0;i<s.length();i++){
			if(Character.isUpperCase(s.charAt(i))){
				result=false;
				break;
			}
			else{
			}
		}
		
		if(result=true && s.length()>=2 && s.length()<=100){
			for(int i=s.length()-1;i>=0;i--){
				if(s.charAt(i)!='.'){
					list.add(s.charAt(i));
				}
				else{
					break;
				}
			}
			
			for(int i=list.size()-1;i>=0;i--){
				System.out.print(list.get(i));
			}
		}
	
	}
}