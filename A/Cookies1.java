import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		String s=sc.next();
		
		int count=0;
		char target='@';
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==target){
				count++;
			}
		}
		
		if((s.length()==n) && d<=n && n<=100 && count>=d){
			System.out.println(n-(count-d));
		}
	}
}