import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class WhichIsAhead{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++){
			map.put(i,sc.nextInt());
		}
		
		int q=sc.nextInt();
		for(int i=0;i<q;i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int a1=0,b1=0;
			for(int j=0;j<n;j++){
				if(map.get(j)==a){
					a1=j;
				}
				else if(map.get(j)==b){
					b1=j;
				}
			}
			if(a1<b1){
				System.out.println(a);
			}
			else{
				System.out.println(b);
			}
		} 
	}
}