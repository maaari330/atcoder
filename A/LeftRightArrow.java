import java.util.Scanner;

public class LeftRightArrow{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		boolean result=false;
		
		if(s.length()>=3 && s.length()<=100){
			if(s.startsWith("<") && s.endsWith(">")){
				for(int i=1;i<s.length()-1;i++){
					if(String.valueOf(s.charAt(i)).equals("=")){
						result=true;
					}
					else{
						result=false;
						break;
					}
				}
				
				if(result==true){
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
		else{
			System.out.println("No");
		}
	}
}
				