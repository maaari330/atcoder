import java.util.*;
import java.math.BigInteger;

public class SmoothNumbers3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Long n=sc.nextLong();
		boolean result=true;
		if(n>=1&&n<=(long)Math.pow(10,18)){
			while(n>3){
				if(n%2==0){
					n=n/2;
				}
				else if(n%3==0){
					n=n/3;
				}
				else{
					result=false;
					break;
				}
			}
			if(result){
				System.out.print("Yes");
			}
			else{
				System.out.print("No");
			}
		}
	}
}