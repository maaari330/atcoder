import java.util.*;

public class TakCode{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		char[][] s=new char[n][m];
		for(int i=0;i<n;i++){
			String c=sc.next();
			for(int j=0;j<m;j++){
				s[i][j]=c.charAt(j);
			}
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(s[i][j]=='#'&&i+8<n&&j+8<m){
					boolean tak=true;
					for(int k=i;k<i+9;k++){
						for(int l=j;l<j+9;l++){
							if(k<i+3&&l<j+3&&s[k][l]=='.'){
								tak=false;
							}
							else if(((k==i+3&&l<=j+3)||(l==j+3&&k<=i+3))&&s[k][l]=='#'){
								tak=false;
							}
							else if(k>i+5&&l>j+5&&s[k][l]=='.'){
								tak=false;
							}
							else if(((k==i+5&&l>=j+5)||(l==j+5&&k>=i+5))&&s[k][l]=='#'){
								tak=false;
							}
						}
					}
					if(tak){
						System.out.println(i+1+" "+(j+1));
					}
				}
			}
		}
	}
}