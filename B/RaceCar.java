import java.util.*;

public class RaceCar{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<String> s=new ArrayList<>();
		for(int i=0;i<n;i++){
			s.add(sc.next());
		}
		boolean result=false;
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				if(i!=j){
					String temp1=s.get(i)+s.get(j);
					StringBuilder sb1=new StringBuilder(temp1);
					if(temp1.equals(sb1.reverse().toString())){
						result=true;
						break;
					}
					
					String temp2=s.get(j)+s.get(i);
					StringBuilder sb2=new StringBuilder(temp2);
					if(temp2.equals(sb2.reverse().toString())){
						result=true;
						break;
					}
				}
			}
		}
		System.out.print(result?"Yes":"No");
	}
}