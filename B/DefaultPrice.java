import java.util.*;

public class DefaultPrice{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		List<String> eat=new ArrayList<>();
		List<String> color=new ArrayList<>();
		Map<String,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++){
			eat.add(sc.next());
		}
		for(int i=0;i<m;i++){
			String s=sc.next();
			color.add(s);
			map.put(s,0);
		}
		int p0=sc.nextInt();
		for(int i=0;i<m;i++){
			int p=sc.nextInt();
			map.replace(color.get(i),p);
		}
		int calc=0,count=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(eat.get(i).equals(color.get(j))){
					calc+=map.get(color.get(j));
					count++;
					break;
				}
			}
		}
		if((n-count)!=0){
			int temp=n-count;
			for(int i=0;i<temp;i++){
				calc+=p0;
			}
		}
		System.out.print(calc);
	}
}