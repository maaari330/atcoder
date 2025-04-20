import java.util.*;

public class Piano2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		List<Integer> a=new ArrayList<Integer>();
		List<Integer> b=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			a.add(sc.nextInt());
		}
		for(int i=0;i<m;i++){
			b.add(sc.nextInt());
		}
		b.addAll(a);
		Collections.sort(b);
		boolean result=false;
		for(int i=0;i<n+m-1;i++){
			if(a.contains(b.get(i)) && a.contains(b.get(i+1))){
				result=true;
			}
		}
		if(result){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}