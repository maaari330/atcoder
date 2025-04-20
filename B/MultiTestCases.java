import java.util.*;

public class MultiTestCases{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++){
			int n=sc.nextInt();
			int count=0;
			for(int j=0;j<n;j++){
				int a=sc.nextInt();
				if(a%2!=0){
					count++;
				}
			}
			System.out.println(count);
		}
	}
}