import java.util.*;

public class MaintainMultipleSequences{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		List<List<Integer>> a=new ArrayList<>();
		for(int i=0;i<n;i++){
			int l=sc.nextInt();
			List<Integer> temp=new ArrayList<>();
			for(int j=0;j<l;j++){
				temp.add(sc.nextInt());
			}
			a.add(temp);
		}
		
		for(int i=0;i<q;i++){
			int s=sc.nextInt();
			int t=sc.nextInt();
			System.out.println(a.get(s-1).get(t-1));
		}
	}
}