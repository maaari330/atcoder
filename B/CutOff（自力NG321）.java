import java.util.*;
import java.util.Arrays;

public class CutOff{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		Integer[] a=new Integer[n-1];
		for(int i=0;i<n-1;i++){
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int min=a[0];
		int max=a[n-2];
		int diff=x;
		for(int i=1;i<n-2;i++){
			diff-=a[i];
		}
		
		if(diff>max){
			System.out.print(-1);
		}
		else if(diff<=min){
			System.out.print(0);
		}
		else{
			System.out.print(diff);
		}
	}
}