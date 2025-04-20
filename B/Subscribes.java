import java.util.*;
import java.math.BigInteger;

public class Subscribes{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		BigInteger n=new BigInteger(s);
		BigInteger result=new BigInteger("0");
		BigInteger ten=new BigInteger("10");
		for(int i=8;i>2;i--){
			if(!(n.divide(ten.pow(i)).equals(BigInteger.ZERO))){
				result=result.add(n.divide(ten.pow(i-2)).multiply(ten.pow(i-2)));
				break;
			}
		}
		if(result.equals(BigInteger.ZERO)){
			result=result.add(n);
		}
		System.out.println(result);
	}
}