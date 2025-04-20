import java.util.Scanner;
import java.util.ArrayList;

public class Append{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<q;i++){
			int b=sc.nextInt();
			int c=sc.nextInt();
			if(b==1){
				list.add(c);
			}
			else{
				System.out.println(list.get(list.size()-c));
			}
		}
	}
}
			