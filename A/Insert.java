import java.util.Scanner;
import java.util.ArrayList;

public class Insert{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int x=sc.nextInt();
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		for(int i=0;i<n;i++){
			a.add(sc.nextInt());
		}
		
		a.add(k,x);
		
		for(int i=0;i<a.size();i++){
			System.out.print(a.get(i)+" ");
		}
	}
}