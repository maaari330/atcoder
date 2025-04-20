import java.util.*;

public class ASCArt{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		char[][] c=new char[h][w];
		char[] abc=new char[27];
		abc[0]='.';
		for(int i=1;i<=26;i++){
			abc[i]=(char)('A'+i-1);
		}
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				c[i][j]=abc[sc.nextInt()];
				System.out.print(c[i][j]);
			}
			System.out.println("");
		}
	}
}