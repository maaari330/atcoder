import java.util.*;

public class ChessBoard{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String[] s=new String[8];
		int x=0,y=0;
		char[] abc=new char[8];
		for(int i=0;i<8;i++){
			s[i]=sc.next();
			abc[i]=(char)('a'+i);
			for(int j=0;j<8;j++){
				if(s[i].charAt(j)=='*'){
					x=i+1;
					y=j;
				}
			}
		}
		
		String ya=String.valueOf(abc[y]);
		int x1=9-x;
		
		System.out.print(ya+x1);
	}
}