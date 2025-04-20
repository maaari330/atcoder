import java.util.*;
import java.math.*;

public class ModuloNumber{
	public static void main(String[] arge){
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long bai=998244353;
		long answer=n%bai;
		// System.out.println(answer);
		if(n>=0){
			System.out.print(answer);
		}
		else{
			// System.out.println(answer+bai);
			System.out.println((bai+n%bai)%bai);
			// System.out.println(bai+(n%bai));
			// System.out.println(bai+n%bai);
		}
		//if(answer>=0){
		//	System.out.print(answer);
		//}
		//else{
			// System.out.println(answer+bai);
			// System.out.println((bai+n%bai)%bai);
			// System.out.println(bai+(n%bai));
		//	System.out.println(bai+n%bai);
		//}		
	}
}
