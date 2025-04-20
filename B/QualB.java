import java.util.*;

public class QualB{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		String str=sc.next();
		int count=0;
		for(int i=0;i<n;i++){
			if(str.charAt(i)=='o'&&count<k){
				System.out.print('o');
				count++;
			}
			else{
				System.out.print('x');
			}
		}
	}
}