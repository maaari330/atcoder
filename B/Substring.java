import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

public class Substring{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int count=0;
		for(int i=1;i<=s.length();i++){
			List<String> list=new ArrayList<String>();
			int j=0;
			while(j+i<=s.length()){
				list.add(s.substring(j,j+i));
				j++;
			}
			List<String> result=new ArrayList<String>(new HashSet<>(list));
			count+=result.size();
		}
		System.out.println(count);
	}
}