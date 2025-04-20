import java.util.*;

public class Measure{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> list=new ArrayList<>();
		for(int i=1;i<=9;i++){
			if(n%i==0){
				list.add(i);
			}
		}
		for(int i=0;i<=n;i++){
			for(int j=0;j<list.size();j++){
				if(i%(n/list.get(j))==0){
					System.out.print(list.get(j));
					break;
				}
				else if(j==list.size()-1){
					System.out.print("-");
				}
			}
		}
	}
}