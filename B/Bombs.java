import java.util.*;

public class Bombs{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		char[][] b=new char[h][w];
		for(int i=0;i<h;i++){
			String s=sc.next();
			for(int j=0;j<w;j++){
				b[i][j]=s.charAt(j);
			}
		}
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				if(b[i][j]!='.'&&b[i][j]!='#'){
					int man=b[i][j]-'0';
					for(int k=0;k<h;k++){
						for(int l=0;l<w;l++){
							if(Math.abs(i-k)+Math.abs(j-l)<=man&&(b[k][l]=='.'||b[k][l]=='#')){
								b[k][l]='.';
							}
						}
					}
				}
			}
		}
		
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				if(b[i][j]!='.'&&b[i][j]!='#'){
					b[i][j]='.';
				}
			}
		}
		
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				System.out.print(b[i][j]);
			}
			System.out.println("");
		}
	}
}