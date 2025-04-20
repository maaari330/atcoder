import java.util.*;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class WorldMeeting{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<List<Boolean>> time=new ArrayList<>();
		List<Integer> membercnt=new ArrayList<>();
		for(int i=0;i<n;i++){
			int w=sc.nextInt();
			membercnt.add(w);
			int x=sc.nextInt();
			List<Boolean> temp=new ArrayList<>();
			int nine=9+x,eighteen=18+x;
			if(nine>=24){
				nine-=24;
			}
			if(eighteen>=24){
				eighteen-=24;
			}
			
			for(int j=0;j<24;j++){
				if(nine<eighteen){
					if(j>=nine&&j<=eighteen-1){
						temp.add(true);
					}
					else{
						temp.add(false);
					}
				}
				else{
					if((j>=nine&&j<=23)||(j>=0&&j<=eighteen-1)){
						temp.add(true);
					}
					else{
						temp.add(false);
					}
				}
			}
			time.add(temp);
		}
		
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<24;i++){
			map.put(i,0);
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<24;j++){
				if(time.get(i).get(j)==true){
					map.replace(j,map.get(j)+membercnt.get(i));
				}
			}
		}
		int max=0;
		for(int i=0;i<24;i++){
			max=Math.max(max,map.get(i));
		}
		System.out.print(max);
	}
}