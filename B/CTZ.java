import java.util.Scanner;

public class CTZ{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=0,count=0;
		if(n%2==1){
			count=0;
		}
		else{
			while(n>=1){
				r=n%2;
				if(r==0){
					count++;
					n=n/2;
				}
				else{
					break;
				}
			}
		}
		System.out.println(count);
	}
}