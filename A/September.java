import java.util.Scanner;

public class September{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String[] s=new String[12];
		int count=0;
		
		for(int i=0;i<12;i++){
			s[i]=sc.next();
		}
		
		
		for(int i=0;i<12;i++){
			if(s[i].length()>=1 && s[i].length()<=100){
				if(s[i].length()==i+1){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}