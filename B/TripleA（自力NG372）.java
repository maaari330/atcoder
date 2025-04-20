import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class TripleA{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt(), count=0,k=3;
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<11;i++){
			map.put(i,0);
		}
		
		for(int i=0;i<11;i++){
			if(k>2){
				int r=m%3;
				map.put(i,r);
				k=m/3;
				m=k;
				count+=r;
			}
			else{
				map.put(i,k);
				break;
			}
		}
		
		System.out.println(count+k);
		
		for(int i=0;i<11;i++){
			if(map.get(i)!=0){
				int temp=map.get(i);
				while(temp>0){
					System.out.print(i+" ");
					temp=temp-1;
				}
			}
		}
	}
}