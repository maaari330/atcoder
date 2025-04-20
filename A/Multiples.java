import java.util.Scanner;

public class Multiples{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int count=0;
		
		if(!(a==b)){
			count=count+2;
		}
		
		if((a+b) %2==0){
			count++;
		}
		
		System.out.println(count);
		
	}
}