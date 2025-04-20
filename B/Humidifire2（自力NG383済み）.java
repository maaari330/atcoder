import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Humidifire2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		int d=sc.nextInt();
		char[][] s=new char[h][w];
		for(int i=0;i<h;i++){
			String temp=sc.next();
			for(int j=0;j<w;j++){
				s[i][j]=temp.charAt(j);
			}
		}
		
		int max=0;
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				for(int k=0;k<h;k++){
					for(int l=0;l<w;l++){
						if(!(k==i&&l==j) &&s[i][j]=='.'&&s[k][l]=='.'){
							int count=0;
							boolean[][] temp=new boolean[h][w];
							temp[i][j]=true;
							temp[k][l]=true;
							count+=2;
							for(int i2=0;i2<h;i2++){
								for(int j2=0;j2<w;j2++){
									if(s[i2][j2]=='.' && (Math.abs(i2-i)+Math.abs(j2-j))<=d){
										if(!temp[i2][j2]){
											temp[i2][j2]=true;
											count++;
										}
									}
								}
							}
							for(int i3=0;i3<h;i3++){
								for(int j3=0;j3<w;j3++){
									if(s[i3][j3]=='.' && (Math.abs(i3-k)+Math.abs(j3-l))<=d){
											if(!temp[i3][j3]){
												temp[i3][j3]=true;
												count++;
											}
									}
								}
							}
							max=Math.max(max,count);
						}
					}
				}
			}
		}
		System.out.println(max);
	}
}