import java.util.Scanner;

public class Cut0{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double x=sc.nextDouble();
		if(x==(int)x){
			System.out.println(String.format("%d",(int)x));
		}
		else{
			System.out.println(String.valueOf(x).replaceAll("\\.0+$",""));
		}
	}
}