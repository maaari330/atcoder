import java.util.*;
import java.math.BigInteger;

public class AA{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long b=sc.nextLong();
		BigInteger bigB=BigInteger.valueOf(b);
		BigInteger result=BigInteger.valueOf(-1);
		for(int i=1;i<=15;i++){
			BigInteger a=BigInteger.valueOf(i);
			BigInteger bigA=a.pow(i);
			if(bigA.equals(bigB)){
				result=BigInteger.valueOf(i);
				break;
			}
		}
		System.out.print(result);
	}
}