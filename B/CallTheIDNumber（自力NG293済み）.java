import java.util.*;

public class CallTheIDNumber{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] person=new int[n+1];
		person[0]=1;
		for(int i=1;i<=n;i++){
			int x=sc.nextInt();
			if(person[i]==0){
				person[x]=1;
			}
		}
		int count=0;
		for(int i=0;i<=n;i++){
			if(person[i]==0){
				count++;
			}
		}
		System.out.println(count);
		for(int i=1;i<=n;i++){
			if(person[i]==0){
				System.out.print(i+" ");
			}
		}
	}
}