import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class SecondBest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			a.add(sc.nextInt());
		}
		
		int max1=0,num1=0,max2=0,num2=0;
		for(int i=0;i<n;i++){
			max1=Math.max(max1,a.get(i));
			num1=a.indexOf(max1);
		}
		a.set(num1,0);
		
		for(int i=0;i<n;i++){
			max2=Math.max(max2,a.get(i));
			num2=a.indexOf(max2);
		}
		System.out.println(num2+1);
	}
}
		