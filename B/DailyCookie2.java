import java.util.Scanner;

public class DailyCookie2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),d=sc.nextInt();
		String s=sc.next();
		String[] line=new String[s.length()];
		
		for(int i=0;i<s.length();i++){
			line[i]=String.valueOf(s.charAt(i));
		}
		
		for(int i=s.length()-1;i>=0;i--){
			if(d>0 && line[i].equals("@")){
				line[i]=".";
				d--;
			}
		}
		
		for(int i=0;i<line.length;i++){
			System.out.print(line[i]);
		}
	}
}