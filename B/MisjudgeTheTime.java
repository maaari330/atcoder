import java.util.*;

public class MisjudgeTheTime{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int H=sc.nextInt();
		int M=sc.nextInt();
		boolean result=false;
		while(result==false){
			int h1=H/10;
			int h2=H%10;
			int m1=M/10;
			int m2=M%10;
			
			if(h1*10+m1>=0&&h1*10+m1<=23&&h2*10+m2>=0&&h2*10+m2<=59){
				System.out.print(H+" "+M);
				result=true;
				return;
			}
			else{
				M++;
				if(M>=60){
					M=0;
					H++;
				}
				if(H>=24){
					H=0;
				}
			}
		}
	}
}