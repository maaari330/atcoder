import java.util.Scanner;

public class Rearranging{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int count1=0, count2=0, count3=0;
		
		if(s.length()==3){
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)=='A'){
					count1++;
				}
				else if(s.charAt(i)=='B'){
					count2++;
				}
				else if(s.charAt(i)=='C'){
					count3++;
				}
				else{
					break;
				}
			}
		
			if(count1==1 && count2==1 && count3==1){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}
		else{
			System.out.println("No");
		}
	}
}