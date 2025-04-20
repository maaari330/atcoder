import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class STRING1122{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		boolean result=true;
		Map<Character,Integer> countmap=new HashMap<>();
		
		if(s.length()%2==0){	
			for(int i=0;i<s.length()/2;i++){
				if(s.charAt(2*i)!=s.charAt(2*i+1)){
					result=false;
				}
			}
		}
		
		if(result){
			for(int i=0;i<s.length();i++){
				char temp=s.charAt(i);
				if(countmap.containsKey(temp)){
					countmap.put(temp,countmap.get(temp)+1);
				}
				else{
					countmap.put(temp,1);
				}
			}
			for(Map.Entry<Character,Integer> resultmap: countmap.entrySet()){
				if(resultmap.getValue()!=2){
					result=false;
					break;
				}
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