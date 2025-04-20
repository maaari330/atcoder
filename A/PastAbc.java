import java.util.Scanner;

public class PastAbc{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		String re="";
		int result=0;
		
		if(s.startsWith("ABC")){
			re=s.substring(3,6);
			result=Integer.parseInt(re);
		}
		
		if(result>=1 &&result<=349){
			if(result!=316){
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
