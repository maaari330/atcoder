import java.util.*;

public class YellowAndRedCard{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		int[] red=new int[n];
		int[] yellow=new int[n];
		for(int i=0;i<q;i++){
			int event=sc.nextInt();
			int x=sc.nextInt();
			switch(event){
			case 1:
				yellow[x-1]++;
				break;
			case 2:
				red[x-1]++;
				break;
			default:
				if(yellow[x-1]>=2||red[x-1]>=1){
					System.out.println("Yes");
				}
				else{
					System.out.println("No");
				}
			}
		}
	}
}