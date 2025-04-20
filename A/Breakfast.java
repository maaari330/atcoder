import java.util.Scanner;

public class Breakfast{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String result="";
		
		if(s.length()==3 && s.contains("R") && s.contains("S") && s.contains("M")){
			if(s.charAt(0)=='R'){
				result="Yes";
			}
			else if(s.charAt(0)=='S'){
				if(s.charAt(1)=='R'){
					result="Yes";
				}
				else{
					result="No";
				}
			}
			else{
				result="No";
			}
			
			System.out.println(result);
		}
	}
}