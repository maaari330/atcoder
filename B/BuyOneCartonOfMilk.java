import java.util.Scanner;

public class BuyOneCartonOfMilk{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=sc.nextInt();
		int m=sc.nextInt();
		int l=sc.nextInt();
		int mincost=(int)Math.pow(10,5);
		for(int i=0;i<=100;i++){
			for(int j=0;j<=100;j++){
				for(int k=0;k<=100;k++){
					int cost=i*s+j*m+k*l;
					int num=i*6+j*8+k*12;
					if(num>=n&&cost!=0){
						mincost=Math.min(mincost,cost);
						
					}
					cost=0;
					num=0;
				}
			}
		}
		System.out.print(mincost);
	}
}