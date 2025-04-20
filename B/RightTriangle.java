import java.util.*;

public class RightTriangle{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] x=new int[4];
		int[] y=new int[4];
		for(int i=0;i<3;i++){
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}
		x[3]=x[0];
		y[3]=y[0];
		
		int[] henx=new int[3];
		int[] heny=new int[3];
		for(int i=0;i<3;i++){
			henx[i]=(int)Math.pow(Math.abs(x[i]-x[i+1]),2);
			heny[i]=(int)Math.pow(Math.abs(y[i]-y[i+1]),2);
		}
		
		int[] hen=new int[5];
		for(int i=0;i<3;i++){
			hen[i]=henx[i]+heny[i];
		}
		hen[3]=hen[0];
		hen[4]=hen[1];
		
		boolean result=false;
		for(int i=0;i<3;i++){
			if(hen[i]+hen[i+1]==hen[i+2]){
				result=true;
			}
		}
		
		if(result){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}