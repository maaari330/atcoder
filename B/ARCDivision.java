import java.util.Scanner;

public class ARCDivision{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(), r=sc.nextInt();
		
		if(n>=1 && n<=100){
			for(int i=0;i<n;i++){
				int d=sc.nextInt(),a=sc.nextInt();
				if(d==1 && r>=1600 && r<=2799){
					r=r+a;
				}
				else if(d==2 && r>=1200 && r<=2399){
					r=r+a;
				}
				else{
					continue;
				}
			}
			
			System.out.println(r);
		}
	}
}