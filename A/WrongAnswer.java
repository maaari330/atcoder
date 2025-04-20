import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class WrongAnswer{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=a+b;
		
		if(a>=0 && a<=9 && b>=0 && b<=9){
			Random rand=new Random();
			List<Integer> list=new ArrayList<Integer>();
			
			for(int i=0;i<10;i++){
				list.add(i);
			}
			list.remove(a+b);
			
			int randre=rand.nextInt(9);
			System.out.println(list.get(randre));
		}
	}
}