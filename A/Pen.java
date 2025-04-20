import java.util.Scanner;

public class Pen{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int g=sc.nextInt();
		int b=sc.nextInt();
		
		String color=sc.next();
		
		if(color.equals("Red")){
			int min=Math.min(g, b);
			System.out.println(min);
		}
		else if(color.equals("Green")){
			int min=Math.min(r, b);
			System.out.println(min);
		}
		else if(color.equals("Blue")){
			int min=Math.min(r, g);
			System.out.println(min);
		}
		else{
		}
		
	}
}