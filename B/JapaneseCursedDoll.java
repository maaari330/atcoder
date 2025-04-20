import java.util.Scanner;
import java.util.*;

public class JapaneseCursedDoll{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=sc.nextInt();
		int p=sc.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		int result=0,count=0;
		
		for(int i=0;i<n;i++){
			list.add(sc.nextInt());
		}
		
		for(int j=0;j<=t;j++){
			for(int i=0;i<n;i++){
				list.set(i,list.get(i)+j);
			}
			count=0;
			for(int i=0;i<n;i++){
				if(list.get(i)>=t){
					count++;
				}
			}
			if(count>=p){
				result=j;
				break;
			}
			for(int i=0;i<n;i++){
				list.set(i,list.get(i)-j);
			}
		}
		System.out.println(result);
	}
}
