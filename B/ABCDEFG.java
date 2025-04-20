import java.util.*;

public class ABCDEFG{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		List<String> abc=new ArrayList<>(Arrays.asList("AB","BC","CD","DE","EF","FG"));
		List<Integer> distance=new ArrayList<>(Arrays.asList(3,1,4,1,5,9));
		char p=sc.next().charAt(0);
		char q=sc.next().charAt(0);
		if(p>q){
			char temp=q;
			q=p;
			p=temp;
		}
		int start=0,end=0;
		for(int i=0;i<6;i++){
			if(p==abc.get(i).charAt(0)){
				start=i;
			}
		}
		for(int i=0;i<6;i++){
			if(q==abc.get(i).charAt(1)){
				end=i;
			}
		}
		int result=0;
		if(start==end){
			result=distance.get(start);
		}
		else{
			for(int i=start;i<=end;i++){
				result+=distance.get(i);
			}
		}
		System.out.print(result);
	}
}