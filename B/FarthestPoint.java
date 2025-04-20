import java.util.Scanner;

public class FarthestPoint{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] x=new int[n+1];
		int[] y=new int[n+1];
		for(int i=0;i<n;i++){
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}
		x[n]=x[0];
		y[n]=y[0];
		for(int i=0;i<n;i++){
			double max=0;
			int result=0;
			for(int j=0;j<n;j++){
				double temp=0;
				if(j!=i){
					temp=Math.pow(x[i]-x[j],2)+Math.pow(y[i]-y[j],2);
					if(temp>max){
						max=temp;
						result=j+1;
					}
				}
			}
			System.out.println(result);
		}
	}
}