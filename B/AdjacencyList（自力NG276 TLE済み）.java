import java.util.*;

public class AdjacencyList{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		StringBuilder sb=new StringBuilder();
		Map<Integer,ArrayList<Integer>> map=new HashMap<>();
		for(int i=1;i<=n;i++){
			map.put(i,new ArrayList<Integer>());
		}
		for(int j=0;j<m;j++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			map.get(a).add(b);
			map.get(b).add(a);
		}
		for(int i=1;i<=n;i++){
			sb.append(map.get(i).size()).append(" ");
			Collections.sort(map.get(i));
			for(int j=0;j<map.get(i).size();j++){
				sb.append(map.get(i).get(j)).append(" ");
			}
			sb.append("\r\n");
		}
		System.out.println(sb.toString());
	}
}