import java.util.Scanner;

public class AvoidRookAttack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char[][] s=new char[8][8];
		
		for(int i=0;i<8;i++){
			String temp=sc.next();
			for(int j=0;j<8;j++){
				s[i][j]=temp.charAt(j);
			}
		}
		
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(s[i][j]=='#'){
					int i1=i;
					int j1=j;
					for(int k=0;k<8;k++){
						if(s[i1][k]=='.'){
							s[i1][k]='*';
						}
						if(s[k][j1]=='.'){
							s[k][j1]='*';
						}
					}
				}
			}
		}
		
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
			}
		}		
		
		int count=0;
		
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(s[i][j]=='.'){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}