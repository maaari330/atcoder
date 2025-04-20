import java.util.Scanner;

public class Western2023{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		boolean result=true;
		
		for(int i=0;i<s.length();i++){
			if(Character.isUpperCase(s.charAt(i))==true){
				result=false;
				break;
			}
			else{
				result=true;
			}
		}
		
		if(s.endsWith("2023")==true && result==true){
			System.out.println(s.replaceAll("2023$","2024"));
		}
	}
}