import java.util.*;

public class Chess960{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		List<Integer> b=new ArrayList<>();
		List<Integer> r=new ArrayList<>();
		int k=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='B'){
				b.add(i+1);
			}
			else if(s.charAt(i)=='R'){
				r.add(i+1);
			}
			else if(s.charAt(i)=='K'){
				k=i+1;
			}
		}
		Collections.sort(r);
		boolean rb=false,rk=false;
		if((b.get(0)%2==0&&b.get(1)%2==1)||(b.get(0)%2==1&&b.get(1)%2==0)){
			rb=true;
		}
		if(r.get(0)<k&&k<r.get(1)){
			rk=true;
		}
		
		System.out.print(rb&&rk?"Yes":"No");
	}
}