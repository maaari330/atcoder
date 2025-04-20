import java.util.*;

public class FindSnuke{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		char[][] s=new char[h][w];
		for(int i=0;i<h;i++){
			String ss=sc.next();
			for(int j=0;j<w;j++){
				s[i][j]=ss.charAt(j);
			}
		}
		
		int a=0,b=0;
		int[] dir1={-1,-1,-1,0,0,1,1,1};
		int[] dir2={-1,0,1,1,-1,-1,0,1};
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				for(int k=0;k<8;k++){
					String str="";
					for(int l=0;l<5;l++){
						a=i+dir1[k]*l;
						b=j+dir2[k]*l;
						if(a>=0&&a<h&&b>=0&&b<w){
							str+=String.valueOf(s[a][b]);
						}
						else{
							break;
						}
					}
					
					if(str.equals("snuke")){
						for(int l=0;l<5;l++){
							a=i+dir1[k]*l+1;
							b=j+dir2[k]*l+1;
							System.out.println(a+" "+b);
						}
					}
				}
			}
		}
	}
}
	