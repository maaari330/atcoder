import java.util.Scanner;

public class GlassAndMug{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int g=sc.nextInt();
		int m=sc.nextInt();
		int mug=0,gl=0;
		for(int i=0;i<k;i++){
			if(gl==g){
				gl=0;
			}
			else if(mug==0){
				mug=m;
			}
			else{
				int cur=Math.min(g-gl,mug);
				gl+=cur;
				mug-=cur;
			}
		}
		System.out.print(gl+" "+mug);
	}
}