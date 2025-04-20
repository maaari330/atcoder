import java.util.Scanner;

public class Correct1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();		
		
		if((n%2==1) && n>=1 && n<=100 && (s.length()==n)){
			String str1="1";
			String str2="2";
			String str="";
			
			int middle=(n+1)/2-1;
			for(int i=0;i<middle;i++){
				str=str.concat(str1);
			}
			str=str.concat("/");
			for(int j=middle;j<s.length()-1;j++){
				str=str.concat(str2);
			}
			if(str.equals(s)){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}
		else{
			System.out.println("No");
		}
	}
}