import java.util.Scanner;

public class Correct2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=String.valueOf(n);
		int count1=0,count2=0, count3=0;
		
		
		for(int i=0;i<str.length();i++){
			if(100000<=n && n<=999999){
				if(str.charAt(i)=='1'){
					count1++;
				}
				else if(str.charAt(i)=='2'){
					count2++;
				}
				else if(str.charAt(i)=='3'){
					count3++;
				}
				else{
					break;
				}
			}
		}
		
		
		if(count1==1 && count2==2 && count3==3){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}
		
		