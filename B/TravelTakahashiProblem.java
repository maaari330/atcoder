import java.util.Scanner;

public class TravelTakahashiProblem{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double cost=0;
		int prex=0,prey=0;
		
		for(int i=0;i<n;i++){
			int x=sc.nextInt(),y=sc.nextInt();
			cost+=Math.sqrt(Math.pow((prex-x),2)+Math.pow((prey-y),2));
			prex=x;
			prey=y;
		}
		
		cost+=Math.sqrt(Math.pow(prex,2)+Math.pow(prey,2));
		System.out.println(cost);
	}
}