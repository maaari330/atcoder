import java.util.Scanner;

public class Strawberries{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(), k=sc.nextInt();
		String s=sc.next();
		s+="X";
		
		int from=s.indexOf("O");
		int to=s.indexOf("X");
		int count=0, total=0;
		
		if(from==-1){
			System.out.println(total);
			return;
		}
		
		while(to!=-1){
			for(int i=from;i<to;i++){
				if(s.charAt(i)=='O'){
					count++;
				}
			}
			if(count>=k){
				total+=count/k;
			}
			from=to+1;
			to=s.indexOf("X",to+1);
			count=0;
		}
		System.out.println(total);
	}
}
