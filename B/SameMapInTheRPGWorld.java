import java.util.*;

public class SameMapInTheRPGWorld{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		char[][] a=new char[h][w];
		char[][] b=new char[h][w];
		char[][] temp=new char[h][w];
		for(int i=0;i<h;i++){
			String s=sc.next();
			for(int j=0;j<w;j++){
				a[i][j]=s.charAt(j);
			}
		}
		for(int i=0;i<h;i++){
			String s=sc.next();
			for(int j=0;j<w;j++){
				b[i][j]=s.charAt(j);
			}
		}
		boolean result=false;
		loop:for(int i=0;i<h;i++){
			heightSlide(a,temp,h,w);
			if(isMatching(temp,b,h,w)){
				result=true;
				break loop;
			}
			for(int j=0;j<w;j++){
				widthSlide(a,temp,h,w);
				if(isMatching(temp,b,h,w)){
					result=true;
					break loop;
				}
			}
		}
		System.out.println(result?"Yes":"No");
	}
	
	private static boolean isMatching(char[][] temp,char[][]b,int h,int w){
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				if(temp[i][j]!=b[i][j]){
					return false;
				}
			}
		}
		return true;
	}
	
	private static void widthSlide(char[][] a,char[][] temp,int h,int w){
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				if(j==0){
					temp[i][j]=a[i][w-1];
				}
				else{
					temp[i][j]=a[i][j-1];
				}
			}
		}
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				a[i][j]=temp[i][j];
			}
		}
	}
	
	private static void heightSlide(char[][] a,char[][] temp,int h,int w){
		for(int j=0;j<w;j++){
			for(int i=0;i<h;i++){
				if(i==0){
					temp[i][j]=a[h-1][j];
				}
				else{
					temp[i][j]=a[i-1][j];
				}
			}
		}
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				a[i][j]=temp[i][j];
			}
		}
	}

}