import java.util.*;

public class FillTheGaps{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> list=new ArrayList<>();
		list.add(sc.nextInt());
		for(int i=0;i<n-1;i++){
			int now=list.get(list.size()-1);
			int next=sc.nextInt();
			if(Math.abs(now-next)!=1){
				if(now<next){
					for(int j=now+1;j<=next;j++){
						list.add(j);
					}
				}
				else{
					for(int j=now-1;j>=next;j--){
						list.add(j);
					}
				}
			}
			else{
				list.add(next);
			}
		}
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+" ");
		}
	}
}