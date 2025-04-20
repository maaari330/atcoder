import java.util.Scanner;
import java.util.ArrayList;

public class Subsegment{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int l=sc.nextInt();
		int r=sc.nextInt();
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		int first=1;
		
		ArrayList<Integer> b=new ArrayList<Integer>();
		
		for(int i=0;i<n;i++){
			a.add(first);
			first++;
		}
		
		if(l!=r){
			for(int i=0;i<l-1;i++){
				b.add(a.get(i));
			}
			for(int i=r-1;l-1<=i;i--){
				b.add(a.get(i));
			}
			for(int i=r;i<n;i++){
				b.add(a.get(i));
			}
		}
		else{
			b.addAll(a);
		}
		
		for(Integer o: b){
			System.out.print(o+" ");
		}
	}
}