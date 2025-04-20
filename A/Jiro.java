import java.util.Scanner;

public class Jiro{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String[] s=new String[3];
		
		for(int i=0;i<3;i++){
			s[i]=sc.next();
		}
		
		String[] abc={"A","B","C"};
		String result="0";
		
		if((s[0].equals("<") && s[1].equals(">")) || (s[0].equals(">") && s[1].equals("<"))){
			result=abc[0];
			System.out.println(result);
		}
		
		if(s[0].equals(">") && s[1].equals(">") && s[2].equals(">")){
			result=abc[1];
			System.out.println(result);
		}
		
		if(s[0].equals(">") && s[1].equals(">") && s[2].equals("<")){
			result=abc[2];
			System.out.println(result);
		}
		
		if(s[0].equals("<") && s[1].equals("<") && s[2].equals("<")){
			result=abc[1];
			System.out.println(result);
		}
		
		if(s[0].equals("<") && s[1].equals("<") && s[2].equals(">")){
			result=abc[2];
			System.out.println(result);
		}
	}
}


