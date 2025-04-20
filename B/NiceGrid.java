import java.util.*;

public class NiceGrid{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		boolean[][] box=new boolean[15][15];
		for(int i=0;i<15;i++){
			for(int j=0;j<15;j++){
				box[i][j]=false;
			}
		}
		for(int i=0;i<15;i++){
			if(i%2==0&&i<=7){
				for(int j=i;j<=14-i;j++){
					box[i][j]=true;
				}
			}
			else if(i%2==0&&i>7){
				for(int j=14-i;j<=i;j++){
					box[i][j]=true;
				}
			}
		}
		for(int i=0;i<15;i++){
			if(i%2==0&&i<=7){
				for(int j=i;j<=14-i;j++){
					box[j][i]=true;
				}
			}
			else if(i%2==0&&i>7){
				for(int j=14-i;j<=i;j++){
					box[j][i]=true;
				}
			}
		}
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		System.out.print(box[r-1][c-1]?"black":"white");
	}
}