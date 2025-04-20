import java.util.Scanner;

public class UnvarnishedReport{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next(),t=sc.next();
		int result=0,leng=0,temp=0;
		
		if(s.length()<t.length()){
			leng=s.length();
			temp=s.length()+1;
		}
		else if(t.length()<s.length()){
			leng=t.length();
			temp=t.length()+1;
		}
		else{
			leng=s.length();
		}
		
		for(int i=0;i<leng;i++){
			if(s.charAt(i)!=t.charAt(i)){
				result=i+1;
				break;
			}
		}
		
		if(result==0 && s.length()!=t.length()){
			result=temp;
		}
		System.out.println(result);
	}
}