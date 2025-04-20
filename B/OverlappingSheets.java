import java.util.*;

public class OverlappingSheets{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		boolean[][] men=new boolean[101][101];
		for(int i=0;i<=100;i++){
			for(int j=0;j<=100;j++){
				men[i][j]=false;
			}
		}
		int count=0;
		int n=sc.nextInt();
		while(n>0){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			for(int i=a+1;i<=b;i++){
				for(int j=c+1;j<=d;j++){
					if(men[i][j]){
					}
					else{
						men[i][j]=true;
						count++;
					}
				}
			}
			n--;
		}
		System.out.print(count);
	}
}