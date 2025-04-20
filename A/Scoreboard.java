import java.util.Scanner;

public class Scoreboard{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] list=new int[n*2];
		int x=0;
		int y=0;
		
		if(n>=1 && n<=100){
			for(int i=0;i<n*2;i++){
				list[i]=sc.nextInt();
			}
			
			for(int i=0;i<list.length;i=i+2){
				if(list[i]>=0 && list[i]<=100){
					x=x+list[i];
				}
			}
			
			for(int i=1;i<list.length;i=i+2){
				if(list[i]>=0 && list[i]<=100){
					y=y+list[i];
				}
			}
			
			if(x>y){
				System.out.println("Takahashi");
			}
			else if(x==y){
				System.out.println("Draw");
			}
			else{
				System.out.println("Aoki");
			}
		}
	}
}