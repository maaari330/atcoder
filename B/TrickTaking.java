import java.util.*;

public class TrickTaking{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=sc.nextInt();
		int[] c=new int[n];
		int[] r=new int[n];
		boolean tcontain=false;
		for(int i=0;i<n;i++){
			c[i]=sc.nextInt();
			if(c[i]==t){
				tcontain=true;
			}
		}
		for(int i=0;i<n;i++){
			r[i]=sc.nextInt();
		}
		
		int max=0,maxplayer=0;
		
		if(tcontain){
			for(int i=0;i<n;i++){
				if(c[i]==t&&max<r[i]){
					max=r[i];
					maxplayer=i+1;
				}
			}
		}
		else{
			int targetcolor=c[0];
			for(int i=0;i<n;i++){
				if(c[i]==targetcolor&&max<r[i]){
					max=r[i];
					maxplayer=i+1;
				}
			}
		}
		System.out.print(maxplayer);
	}
}	