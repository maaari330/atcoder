import java.util.Scanner;

public class Takahashi{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int count=0;
		
		char[] ch=s.toCharArray();
		boolean[] b=new boolean[s.length()];

		for(int i=0;i<s.length()-1;i++){
			b[i]=Character.isUpperCase(ch[i]);
		}
		
		for(boolean result : b){
			if(result==false){
				count++;
			}
			else{
				break;
			}
		}
				
		if(count==s.length()){
			if(s.charAt(s.length()-3)=='s' && s.charAt(s.length()-2)=='a' && s.charAt(s.length()-1)=='n'){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}
	}
}