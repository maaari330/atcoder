import java.util.*;
import java.math.BigInteger;

public class ABCDEF{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		BigInteger a=new BigInteger(sc.next());
		BigInteger b=new BigInteger(sc.next());
		BigInteger c=new BigInteger(sc.next());
		BigInteger d=new BigInteger(sc.next());
		BigInteger e=new BigInteger(sc.next());
		BigInteger f=new BigInteger(sc.next());
		BigInteger abc=a.multiply(b).multiply(c);
		BigInteger def=d.multiply(e).multiply(f);
		BigInteger abcdef=abc.subtract(def);
		BigInteger x=new BigInteger("998244353");
		BigInteger result=abcdef.remainder(x);
		System.out.print(result);
	}
}