import java.util.Scanner;
import java.util.ArrayList;

public class CountTakahashi{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int count=0;
		ArrayList<String> s=new ArrayList<String>();
		
		for(int i=0;i<n;i++){
			s.add(sc.next());
		}
		
		if(n>=1 && n<=100){
			for(int i=0;i<s.size();i++){
				if(s.get(i).equals("Takahashi")){
					count++;
				}
			}
			System.out.println(count);
		}
	}
}