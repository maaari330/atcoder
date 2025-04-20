import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class Frequency{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char[] alpha=new char[26];
		Map<Character,Integer> map=new HashMap<>();
		for(char a='a';a<='z';a++){
			int i=0;
			map.put(a,0);
			alpha[i]=a;
			i++;
		}
		for(int i=0;i<s.length();i++){
			map.replace(s.charAt(i),map.get(s.charAt(i))+1);
		}
	
		int max=0;
		char result=0;
		for(char i='a';i<='z';i++){
			if(max<map.get(i)){
				max=Math.max(max,map.get(i));
				result=i;
			}
			else if(max==map.get(i)){
				int index1=Arrays.asList().indexOf(result);
				int index2=Arrays.asList(alpha).indexOf(i);
				if(index1<index2){
					result=i;
				}
			}
		}
		System.out.println(result);
	}
}