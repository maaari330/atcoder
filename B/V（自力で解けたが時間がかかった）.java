import java.util.*;

public class V{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		List<Integer> ten=new ArrayList<>();
		Queue<Integer> all= new ArrayDeque<>();
		for(int i=0;i<m;i++){
			ten.add(sc.nextInt());
		}
		for(int i=0;i<n;i++){
			all.add(i+1);
		}
		
		List<Integer> list= new ArrayList<>();
		while(!all.isEmpty()){
			if(ten.contains(all.peek())){
				list.add(all.poll());
			}
			else if(list.size()>0&&Collections.max(list)+1==all.peek()){
				list.add(all.poll());
				Collections.sort(list,Collections.reverseOrder());
				for(int r:list){
					System.out.print(r+" ");
				}
				list.clear();
			}
			else{
				System.out.print(all.poll()+" ");
			}
		}
	}
}
