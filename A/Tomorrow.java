import java.util.Scanner;

public class Tomorrow{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int M=sc.nextInt(), D=sc.nextInt(), y=sc.nextInt(), m=sc.nextInt(),d=sc.nextInt();
		
		if(d==D){
			d=1;
			m++;
		}
		else{
			d++;
		}
		
		if(m==M+1){
			m=1;
			y++;
		}
		else{
		}
		
		System.out.println(y+" "+m+" "+d);
	}
}
		