import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Shout{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		String[] time=new String[24];
		ArrayList<String> allow=new ArrayList<String>();
		
		for(int i=0;i<24;i++){
			time[i]=String.valueOf(i);
		}
		
		if(a>=0 && a<24 && b>=0 && b<24 && c>=0 && c<24){
			if(b<c){
				for(int i=0;i<b;i++){
					allow.add(time[i]);
				}
				for(int i=c;i<24;i++){
					allow.add(time[i]);
				}
				
			}
			else if(b>c){
				for(int i=c;i<b;i++){
					allow.add(time[i]);
				}				
			}
			else{
			}
			
			if(allow.contains(String.valueOf(a))){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}
	}
}
			