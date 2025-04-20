import java.util.*;

public class QualificationContest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		List<String> name=new ArrayList<>();
		for(int i=0;i<k;i++){
			name.add(sc.next());
		}
		Collections.sort(name);
		for(String result:name){
			System.out.println(result);
		}
	}
}