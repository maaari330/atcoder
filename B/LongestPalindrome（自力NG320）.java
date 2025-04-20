import java.util.*;

public class LongestPalindrome{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int max=1;
		for(int i=0;i<s.length()-1;i++){
			for(int j=i;j<s.length();j++){
				if(s.charAt(i)==s.charAt(j)){
					String sub="",reverse="";
					if(j!=s.length()-1){
						sub=s.substring(i,j+1);
					}
					else{
						sub=s.substring(i);
					}
					reverse=new StringBuilder(sub).reverse().toString();
					if(sub.equals(reverse)){
						max=Math.max(max,sub.length());
					}
				}
			}
		}
		System.out.print(max);
	}
}