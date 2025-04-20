import java.util.*;

public class Next{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			list.add(sc.nextInt());
		}
		Collections.sort(list,Collections.reverseOrder());
		List<Integer> list2=new ArrayList<Integer>(new LinkedHashSet<>(list));
		System.out.print(list2.get(1));
	}
}
