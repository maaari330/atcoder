import java.util.Scanner;

public class Plant{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		
		int day=0;
		int len=0;
		
		for(int i=0;i<=Math.pow(10,9);i++){
			if(len<=h){
				len=len+(int)Math.pow(2,i);
				day++;
			}
			else{
				break;
			}
		}
		System.out.println(day);
	}
}