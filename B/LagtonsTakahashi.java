import java.util.Scanner;

public class LagtonsTakahashi{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		char[][] a=new char[h][w];
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				a[i][j]='.';
			}
		}
		int n=sc.nextInt(),ci=0,cj=0,cur=0;
		for(int i=0;i<n;i++){
			if(ci>=h){
				ci=ci-h;
			}
			else if(cj>=w){
				cj=cj-w;
			}
			else if(ci<0){
				ci=h-1;
			}
			else if(cj<0){
				cj=w-1;
			}
	
			if(a[ci][cj]=='.'){
				a[ci][cj]='#';
				switch(cur){
				case 0:
					cj+=1;
					cur=1;
					break;
				case 1:
					ci+=1;
					cur=2;
					break;
				case 2:
					cj-=1;
					cur=3;
					break;
				case 3:
					ci-=1;
					cur=0;
					break;
				}
			}
			else{
				a[ci][cj]='.';
				switch(cur){
				case 0:
					cj-=1;
					cur=3;
					break;
				case 1:
					ci-=1;
					cur=0;
					break;
				case 2:
					cj+=1;
					cur=1;
					break;
				case 3:
					ci+=1;
					cur=2;
					break;
				}
			}
		}
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}