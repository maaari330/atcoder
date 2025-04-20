import java.util.*;

public class VacationTogether{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		char[][] c=new char[n][d];
		int[] daycnt=new int[d];
		for(int i=0;i<n;i++){
			String s=sc.next();
			for(int j=0;j<d;j++){
				c[i][j]=s.charAt(j);
				if(c[i][j]=='o'){
					daycnt[j]++;
				}
			}
		}
		
		int max=0,count=0;
		for(int i=0;i<d;i++){
			if(daycnt[i]==n){
				count++;
			}
			else if(daycnt[i]!=n){
				max=Math.max(max,count);
				count=0;
			}
		}
		max=Math.max(max,count);

		System.out.print(max);
	}
}