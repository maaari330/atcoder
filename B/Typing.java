import java.util.*;

public class Typing{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String a=sc.next();
		int temp=0;
		for(int i=0;i<s.length();i++){
			int result=a.indexOf(s.charAt(i),temp);
			System.out.print((result+1)+" ");
			temp=result+1;
		}
	}
}