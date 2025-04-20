import java.util.*;

public class Hammer{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		if(x>0&&y<0||x<0&&y>0||x>0&&y>0&&x<y||x<0&&y<0&&x>y||x>0&&y>0&&z<y&&z>0||x<0&&y<0&&z>y&&z<0){
			System.out.print(Math.abs(x));
			return;
		}
		else if(x>0&&y>0&&z<y&&z<0||x<0&&y<0&&z>y&&z>0){
			System.out.print(Math.abs(z)*2+Math.abs(x));
			return;
		}
		else{
			System.out.print(-1);
			return;
		}
	}
}