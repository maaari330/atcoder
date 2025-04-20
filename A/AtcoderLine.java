import java.util.Scanner;
import java.util.ArrayList;

public class AtcoderLine{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		
		ArrayList<Integer> sta=new ArrayList<Integer>();
		
		if(n>=3 && n<=100){
			for(int i=1;i<=n;i++){
				sta.add(i);
			}
			
			if(x>y){
				for(int i=y-1;i<x;i++){
					if(i==z-1){
						System.out.println("Yes");
						break;
					}
					else if(i==x-1 && i!=z-1){
						System.out.println("No");
					}
					else{
					}
				}
			}
			else if(x<y){
				for(int i=x-1;i<y;i++){
					if(i==z-1){
						System.out.println("Yes");
						break;
					}
					else if(i==y-1 && i!=z-1){
						System.out.println("No");
					}
					else{
					}
				}
			}
			else{
			}
		}
	}
}