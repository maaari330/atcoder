import java.util.*;

public class Piano{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int w=sc.nextInt();
		int b=sc.nextInt();
		int n=w+b;
		boolean result=false;
		String s="wbwbwwbwbwbw";
		for(int i=0;i<12;i++){
			s+=s;
		}
		for(int si=0;si<s.length();si++){
			int wcnt=0;
			if(si+n-1<s.length()){
				for(int i=0;i<n;i++){
					if(s.charAt(si+i)=='w'){
						wcnt++;
					}
				}
				if(wcnt==w){
					result=true;
					break;
				}
			}
		}
		System.out.println(result?"Yes":"No");
	}
}