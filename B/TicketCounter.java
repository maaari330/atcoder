import java.util.Scanner;

public class TicketCounter{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int[] t=new int[n];
		int time=0;
		for(int i=0;i<n;i++){
			t[i]=sc.nextInt();
			if(time<t[i]){
				time=time+a+(t[i]-time);
			}
			else{
				time+=a;
			}
			System.out.println(time);
		}
	}
}