import java.util.Scanner;

public class DKeyboard{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int cur=s.indexOf("A"),count=0;
		char[] c=new char[26];
		
		for(int i=0;i<26;i++){
			c[i]=Character.toUpperCase((char)(97+i));
		}
		
		for(int i=0;i<26;i++){
			int next=s.indexOf(String.valueOf(c[i]));
			count+=Math.abs(cur-next);
			cur=next;
		}
		System.out.println(count);
	}
}