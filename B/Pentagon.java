import java.util.Scanner;
import java.util.Arrays;

public class Pentagon{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String[] a={"AB","BA","BC","CB","CD","DC","DE","ED","AE","EA"};
		String[] b={"AC","CA","AD","DA","BE","EB","BD","DB","CE","EC"};
		String s=sc.next();
		String t=sc.next();
		boolean result=false;
		if(Arrays.asList(a).contains(s)){
			if(Arrays.asList(a).contains(t)){
				result=true;
			}
		}
		else{
			if(Arrays.asList(b).contains(t)){
				result=true;
			}
		}
		if(result){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}