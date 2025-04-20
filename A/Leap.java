import java.util.Scanner;

public class Leap{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt();
		
		int normal=365;
		int leapy=366;
		
		if((y%4!=0) || (y%100==0 && y%400!=0)){
			System.out.println(normal);
		}
		else{
			System.out.println(leapy);
		}
	}
}