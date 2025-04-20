import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class Commencement{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		List<Character> list=new ArrayList<Character>();
		for(int i=0;i<s.length();i++){
			list.add(s.charAt(i));
		}
		List<Character> fin=new ArrayList<Character>(new HashSet<>(list));
		
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=1;i<=100;i++){
			map.put(i,0);
		}
		for(int i=0;i<fin.size();i++){
			int count=0;
			for(int j=0;j<list.size();j++){
				if(fin.get(i)==list.get(j)){
					count++;
				}
			}
			map.replace(count,map.get(count)+1);
		}
		boolean result=true;
		for(int i=1;i<=map.size();i++){
			if(map.get(i)==0 ||map.get(i)==2){
				result=true;
			}
			else{
				result=false;
				break;
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