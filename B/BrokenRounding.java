import java.util.*;
import java.math.BigInteger;

public class BrokenRounding{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		BigInteger x=new BigInteger(sc.next());
		BigInteger four=new BigInteger("4");
		int k=sc.nextInt();
		for(int i=0;i<k;i++){
			if(x.remainder(BigInteger.TEN.pow(i+1)).divide(BigInteger.TEN.pow(i)).compareTo(four)==1){
				x=x.divide(BigInteger.TEN.pow(i+1)).add(BigInteger.ONE).multiply(BigInteger.TEN.pow(i+1));
			}
			else{
				x=x.divide(BigInteger.TEN.pow(i+1)).multiply(BigInteger.TEN.pow(i+1));
			}
		}
		System.out.print(x.toString());
	}
}