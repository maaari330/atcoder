import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Spoiler{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int count=0;
		
		if(s.length()>=2 && s.length()<=100){
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)=='|'){
					count++;
				}
			}
			
			if(count==2){
				String[] str=s.split("\\|");
				ArrayList<String> result=new ArrayList<String>(Arrays.asList(str));
				
				if(result.size()>1){
					result.remove(1);
				}
				
				for(String fi: result){
					System.out.print(fi);
				}
			}
		}
	}
}
				