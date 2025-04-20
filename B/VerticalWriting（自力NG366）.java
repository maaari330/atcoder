import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class VerticalWriting{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),m2=0;
		ArrayList<String> list=new ArrayList<String>();
		ArrayList<Integer> num=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			list.add(sc.next());
			num.add(list.get(i).length());
		}
		
		int m1=list.get(0).length();
		for(int i=1;i<n;i++){
			m1=Math.max(m1,list.get(i).length());
		}
		
		for(int i=0;i<n;i++){
			if(num.get(i)<m1){
				int len=m1-num.get(i);
				while(len>0){
					list.set(i,list.get(i)+"*");
					len--;
				}
			}
		}
		


		for(int i=0;i<m1;i++){
			String result="";
			for(int j=0;j<n;j++){
				result=result+list.get(j).charAt(i);
			}
			StringBuilder sb=new StringBuilder(result);
			sb=sb.reverse();
		    
			int b=0;
			for(int j=sb.length()-1;j>=0;j--){
				char c=sb.charAt(j);
				if(Character.isLowerCase(c)){
					b=j;
					break;
				}
			}
			
			sb.replace(b+1,sb.length(),"");
			System.out.println(sb.toString());
		}
		
	}
}