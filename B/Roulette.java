import java.util.*;

public class Roulette{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<List<Integer>> a=new ArrayList<>();
		List<Integer> c=new ArrayList<>(); 
		for(int i=0;i<n;i++){
			int ctemp=sc.nextInt();
			c.add(ctemp);
			List<Integer> atemp=new ArrayList<>();
			for(int j=0;j<ctemp;j++){
				atemp.add(sc.nextInt());
			}
			a.add(atemp);
		}
		
		int x=sc.nextInt();
		int min=37;
		List<Integer> result=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			if(a.get(i).contains(x)){
				if(c.get(i)<min){
					min=c.get(i);
					result.clear();
					result.add(i+1);
				}
				else if(c.get(i)==min){
					result.add(i+1);
				}
			}
		}
		System.out.println(result.size());
		
		for(int fin:result){
			System.out.print(fin+" ");
		}
	}
}