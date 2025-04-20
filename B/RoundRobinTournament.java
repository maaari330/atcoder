import java.util.*;
import java.util.Map;
import java.util.TreeMap;

public class RoundRobinTournament{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Map<Integer,Integer> map=new TreeMap<>();
		for(int i=0;i<n;i++){
			String s=sc.next();
			int count=0;
			for(int j=0;j<s.length();j++){
				if(s.charAt(j)=='o'){
					count++;
				}
			}
			map.put(i,count);
		}
		int count1=n;
		while(count1>0){
			int max=-1,result=0;
			for(int j=0;j<n;j++){
				if(map.get(j)!=-1&&max<map.get(j)){
					max=map.get(j);
					result=j;
				}
			}
			System.out.print(result+1+" ");
			map.replace(result,-1);
			count1--;
		}
	}
}