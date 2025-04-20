import java.util.*;

public class IntersectionOfCuboids{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] c1=new int[3];
		for(int i=0;i<c1.length;i++){
			c1[i]=sc.nextInt();
		}
		int[] c2=new int[3];
		for(int i=0;i<c2.length;i++){
			c2[i]=sc.nextInt();
		}
		int[] g1=new int[3];
		for(int i=0;i<g1.length;i++){
			g1[i]=sc.nextInt();
		}
		int[] g2=new int[3];
		for(int i=0;i<g2.length;i++){
			g2[i]=sc.nextInt();
		}
		
		int result=1;
		for(int i=0;i<3;i++){
			if(c2[i]<=g1[i] || c1[i]>=g2[i]){
				result=0;
			}
			else if(c2[i]>g2[i] && c1[i]>g1[i]){
				result*=Math.abs(g2[i]-c1[i]);
			}
			else if(c2[i]<g2[i] && c1[i]<g1[i]){
				result*=Math.abs(c2[i]-g1[i]);
			}
			else{
				result*=Math.abs(g2[i]-g1[i]);
			}
		}
		if(result>0){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}