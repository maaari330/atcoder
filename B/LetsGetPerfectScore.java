import java.util.*;

public class LetsGetPerfectScore{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		String[] qi=new String[n];
		String ans="";
		for(int i=0;i<n;i++){
			qi[i]=sc.next();
		}
		int count=0;
		for(int i=0;i<q;i++){
			ans+="o";
		}
		
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				String result="";
				for(int k=0;k<q;k++){
					if(i!=j&&(qi[i].charAt(k)=='o'||qi[j].charAt(k)=='o')){
						result+="o";
					}
					else if(i!=j){
						result+="x";
					}
				}
				
				
				if(result.equals(ans)){
					count++;
				}
			}
		}
		System.out.print(count);
	}
}