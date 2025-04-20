import java.util.*;

public class LongestUncommonPrefix{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		for(int i=1;i<n;i++){
			int result=0;
			for(int j=0;j<n;j++){
				if(j+i<n&&s.charAt(j)!=s.charAt(j+i)){
					result=j+1;
				}
				else{
					break;
				}
			}
			System.out.println(result);
		}
	}
}