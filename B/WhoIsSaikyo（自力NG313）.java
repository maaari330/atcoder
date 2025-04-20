import java.util.*;

public class WhoIsSaikyo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] s=new int[n];
		
		for(int i=0;i<m;i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			for(int j=0;j<n;j++){
				if(j+1==b){
					s[j]++;
				}
			}
		}
		
		int min=0,count=0,ans=0;
		for(int i=0;i<n;i++){
			if(s[i]==0){
				count++;
				ans=i+1;
			}
		}
		
		
		if(count==1){
			System.out.print(ans);
		}
		else{
			System.out.print(-1);
		}
	}
}