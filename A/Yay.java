import java.util.Scanner;

public class Yay{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();

		
		if(s.length()>=3 && s.length()<=100){
			for(int i=0;i<s.length()-2;i++){
				if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i+1)== s.charAt(i+2)){
					System.out.println(i+1);
					break;
				}
				else if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i)== s.charAt(i+2)){
					System.out.println(i+2);
					break;
				}
				else if(s.charAt(s.length()-2)!=s.charAt(s.length()-1) && s.charAt(s.length()-2)==s.charAt(s.length()-3)){
					System.out.println(s.length());
					break;
				}
				else{
				}
			}
		}
	}
}