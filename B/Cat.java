import java.util.*;

public class Cat{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		String result="";
		for(int i=0;i<n;i++){
			if(i+1<n&&s.charAt(i)=='n'&&s.charAt(i+1)=='a'){
				result+="nya";
				i++;
			}
			else{
				result+=String.valueOf(s.charAt(i));
			}
		}
		System.out.print(result);
	}
}