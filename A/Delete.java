import java.util.Scanner;

public class Delete{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char[] s=new char[str.length()];
		int count=0;
		String result="";
		
		if(1<=str.length() && str.length()<=100){
			for(int i=0;i<str.length();i++){
				s[i]=str.charAt(i);
				if((Character.isUpperCase(s[i])==false && Character.isDigit(s[i])==false) || s[i]=='.'){
					count++;
				}
				if(count==str.length()){
					result=str.replace(".","");
				}
			}
			System.out.println(result);
		}
		
	}
}
