import java.util.*;

public class DentistAoki{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		boolean[] b=new boolean[n];
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++){
			b[i]=true;
			map.put(i,0);
		}
		for(int i=0;i<q;i++){
			int temp=sc.nextInt()-1;
			if(map.get(temp)%2==0){
				b[temp]=false;
			}
			else{
				b[temp]=true;
			}
			map.replace(temp,map.get(temp)+1);
		}
		int count=0;
		for(int i=0;i<n;i++){
			if(b[i]){
				count++;
			}
		}
		System.out.println(count);
	}
}