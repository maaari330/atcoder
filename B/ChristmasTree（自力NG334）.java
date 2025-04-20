import java.util.Scanner;

public class ChristmasTree{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long m=sc.nextLong();
		long l=sc.nextLong();
		long r=sc.nextLong();
		long bigk=Math.floorDiv(r-a,m);
		long smallk=Math.floorDiv(l-a-1,m);
		
		System.out.println(bigk-smallk);
	}
}