import java.util.Scanner;

public class Glutton{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] s=new String[n];
		int count=0;
		
		for(int i=0;i<n;i++){
			s[i]=sc.next();
		}
		
		for(int i=0;i<n-2;i++){
			if(s[i].equals("sweet") && s[i+1].equals("sweet")){
				count++;
			}
		}
		
		if(count>0){
			System.out.println("No");
		}
		else{
			System.out.println("Yes");
		}
		
	}
}