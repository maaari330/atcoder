import java.util.*;
import java.math.BigInteger;

public class Base2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		BigInteger calc=new BigInteger("0");
		BigInteger one=new BigInteger("1");
		for(int i=0;i<64;i++){
			String s=sc.next();
			BigInteger a=new BigInteger(s);
			if(a.equals(one)){
				BigInteger two=new BigInteger("2");
				calc=calc.add(two.pow(i));
			}
		}
		System.out.println(calc);
	}
}