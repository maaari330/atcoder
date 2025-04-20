import java.util.*;

public class PlayingCardsValidation{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<String> check=new ArrayList<>();
		String one="HDCS";
		String two="A23456789TJQK"; 
		for(int i=0;i<n;i++){
			String si=sc.next();
			for(int j=0;j<check.size();j++){
				if(si.equals(check.get(j))){
					System.out.print("No");
					return;
				}
			}
			if(!one.contains(String.valueOf(si.charAt(0)))){
				System.out.print("No");
				return;
			}
			if(!two.contains(String.valueOf(si.charAt(1)))){
				System.out.print("No");
				return;
			}
			check.add(si);
		}
		System.out.print("Yes");
	}
}