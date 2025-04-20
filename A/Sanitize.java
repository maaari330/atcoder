import java.util.Scanner;

public class Sanitize{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();

		int count=0;
		int[] h=new int[n];
		
		for(int i=0;i<n;i++){
			h[i]=sc.nextInt();
		}
		

		for(int i=0;i<n;i++){
			if(m>=h[i]){
				m=m-h[i];
				count++;
			}
			else{
				break;
			}
		}
			
		System.out.println(count);
		
	}
}