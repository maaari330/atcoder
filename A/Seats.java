import java.util.Scanner;

public class Seats{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=sc.next();
		
		char[] s=new char[n];
		int count=0;
		
		if(1<=n && n<=200000){
			for(int i=0;i<n;i++){
				s[i]=str.charAt(i);
			}

			
			for(int i=0;i<n-2;i++){
				if(s[i]=='#' && s[i+1]=='.' && s[i+2]=='#'){
					count++;
				}
			}
			System.out.println(count);
		}
	}
}