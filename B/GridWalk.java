import java.util.Scanner;

public class GridWalk{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		int si=sc.nextInt();
		int sj=sc.nextInt();
		char[][] c=new char[h][w];
		
		for(int i=0;i<h;i++){
			String temp=sc.next();
			for(int j=0;j<w;j++){
				c[i][j]=temp.charAt(j);
			}
		}
		int x=si-1,y=sj-1;
		String X=sc.next();
		for(int i=0;i<X.length();i++){
			if(X.charAt(i)=='L' && y-1>=0){
				if(c[x][y-1]=='.'){
					y=y-1;
				}
			}
			if(X.charAt(i)=='R' && y+1<w){
				if(c[x][y+1]=='.'){
					y=y+1;
				}
			}
			if(X.charAt(i)=='U' && x-1>=0){
				if(c[x-1][y]=='.'){
					x=x-1;
				}
			}
			if(X.charAt(i)=='D' && x+1<h){
				if(c[x+1][y]=='.'){
					x=x+1;
				}
			}
		}
		System.out.println((x+1)+" "+(y+1));
	}
}