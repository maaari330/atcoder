import java.util.*;

public class AtCoderJanken2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] s=new String[n];
		int count=0;
		for(int i=0;i<n;i++){
			s[i]=sc.next();
			count+=sc.nextInt();
		}
		int rest=count%n;
		Arrays.sort(s);
		for(int i=0;i<n;i++){
			if(i==rest){
				System.out.println(s[i]);
			}
		}
	}
}