import java.util.*;

public class LikeNumbers326{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result=0;
		for(int i=n;i<=919;i++){
			int one=i%10;
			int ten=(i/10)%10;
			int hun=0;
			if(i/100<10){
				hun=((i/10)/10)%10;
			}
			else{
				hun=((i/10)/10)/10;
			}
			if(hun*ten==one){
				result=i;
				break;
			}
		}
		System.out.print(result);
	}
}