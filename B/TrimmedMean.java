import java.util.*;

public class TrimmedMean{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double[] score=new double[5*n];
		for(int i=0;i<5*n;i++){
			score[i]=sc.nextDouble();
		}
		Arrays.sort(score);
		
		for(int i=0;i<n;i++){
			score[i]=-1;
		}
		for(int i=5*n-1;i>=5*n-1-(n-1);i--){
			score[i]=-1;
		}
		double calc=0;
		for(int i=0;i<5*n;i++){
			if(score[i]!=-1){
				calc+=score[i];
			}
		}
		
		double n3=(double)3*n;

		System.out.print(calc/n3);
	}
}