import java.util.Scanner;

public class IntegerDivisionReturns{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long x=sc.nextLong();
		long a=x/10,b=x%10,result=0;
		if(b!=0&&a>0){
			result=a+1;
		}
		else if(b!=0&&a==0){
			if(b>0){
				result=a+1;
			}
			else{
				result=a;
			}
		}
		else{	
			result=a;
		}
		System.out.println(result);
	}
}