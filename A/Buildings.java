import java.util.Scanner;

public class Buildings{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] h=new int[n];
		
		for(int i=0;i<n;i++){
			h[i]=sc.nextInt();
		}
		
		if(h.length!=1){
			for(int i=1;i<n;i++){
				if(h[0]<h[i]){
					System.out.println(i+1);
					break;
				}
				else if((i==n-1)&&(h[0]>=h[i])){
					System.out.println(-1);
				}
				else{
				}
			}
		}
		else{
			System.out.println(-1);
		}
		
	}
}