import java.util.Scanner;

public class HandsOnRing{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(), q=sc.nextInt(), l=1, r=2, count=0;
		
		for(int i=0;i<q;i++){
			String h=sc.next();
			int t=sc.nextInt();
			
			switch(h){
				case "L":
					if(l<r&&r<t){
						count+=l+(n-t);
					}
					else if(t<r&&r<l){
						count+=t+(n-l);
					}
					else{
						count+=Math.abs(t-l);
					}
					l=t;
					break;
				case "R":
					if(r<l&&l<t){
						count+=r+(n-t);
					}
					else if(t<l&&l<r){
						count+=t+(n-r);
					}
					else{
						count+=Math.abs(t-r);
					}
					r=t;
					break;
			}
		}
		System.out.println(count);
	}
}