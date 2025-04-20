import java.util.Scanner;
import java.util.ArrayList;

public class Delimeter{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		int temp=1;
		while(temp!=0){
			temp=sc.nextInt();
			list.add(temp);
		}
		for(int i=list.size()-1;i>=0;i--){
			System.out.println(list.get(i));
		}
	}
}