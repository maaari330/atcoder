import java.util.*;

public class TheMiddleDay{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int day=0;
		int[] d=new int[n];
		for(int i=0;i<n;i++){
			d[i]=sc.nextInt();
			day+=d[i];
		}
		int middle=(day+1)/2,a=0,b=0;
		for(int i=0;i<n;i++){
			if(middle-d[i]>0){
				middle-=d[i];
			}
			else if(middle-d[i]==0){
				a=i+1;
				b=d[i];
				break;
			}
			else{
				a=i+1;
				b=middle;
				break;
			}
		}
		System.out.print(a+" "+b);
	}
}