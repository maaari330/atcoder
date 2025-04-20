import java.util.Scanner;

public class Candy{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=sc.nextInt();
		int[] t=new int[n];
		int count=1;
		
		if(1<=n && n<=100 && 1<=c && c<=1000){
			for(int i=0;i<t.length;i++){
				t[i]=sc.nextInt();
			}
			
		outer: for(int i=0;i<t.length-1;){
			inner: for(int j=i+1;j<t.length;j++){
				if((t[j]-t[i])>=c){
					count++;
					i=j;
					break inner;
				}
				else{
					if(j==t.length-1){
						break outer;
					}
					else{
						continue inner;
					}
				}
			}
		}
		System.out.println(count);
		}
	}
}