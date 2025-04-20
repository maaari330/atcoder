import java.util.*;

public class Explore{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		long t=sc.nextLong();
		long[] a=new long[n-1];
		Map<Integer,Long> map=new HashMap<>();
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++){
			int x=sc.nextInt();
			long y=sc.nextLong();
			map.put(x,y);
		}
		for(int i=0;i<a.length;i++){
			if(t-a[i]<=0){
				System.out.print("No");
				return;
			}
			else{
				t-=a[i];
			}
			if(map.containsKey(i+2)){
				t+=map.get(i+2);
			}
		}
		System.out.print("Yes");
	}
}