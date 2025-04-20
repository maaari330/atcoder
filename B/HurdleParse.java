import java.util.Scanner;

public class HurdleParse{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int from=s.indexOf("|");
		int to=s.indexOf("|",1);
		int count=0;
		
		while(from < s.length()){
			if(to==-1){
				to=s.length();
				break;
			}
			
			for(int i=from+1;i<to;i++){
				if(String.valueOf(s.charAt(i)).equals("-")){
					count++;
				}
				else{
					continue;
				}
			}
			System.out.print(count+" ");
			from=to;
			to=s.indexOf("|",from+1);
			count=0;
		}
	}
}