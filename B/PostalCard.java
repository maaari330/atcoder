import java.util.*;

public class PostalCard{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		String[] s=new String[n];
		String[] t=new String[m];
		for(int i=0;i<n;i++){
			s[i]=sc.next();
		}
		for(int i=0;i<m;i++){
			t[i]=sc.next();
		}
		int count=0;
		for(int i=0;i<n;i++){
			String test=s[i].substring(s[i].length()-3);
			for(int j=0;j<m;j++){
				if(test.equals(t[j])){
					count++;
					break;
				}
			}
		}
		System.out.print(count);
	}
}