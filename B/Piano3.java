import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Piano3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(), count=0;
		Map<String,Integer> map=new HashMap<>();
		map.put("L",0);
		map.put("R",0);
		
		for(int i=0;i<n;i++){
			int a=sc.nextInt();
			String s=sc.next();
			if(s.equals("L")&& map.get("L")==0){
				map.replace("L",a);
			}
			else if(s.equals("R")&& map.get("R")==0){
				map.replace("R",a);
			}
			else if(s.equals("L")&& map.get("L")!=0){
				count+=Math.abs(a-map.get("L"));
				map.replace("L",a);
			}
			else{
				count+=Math.abs(a-map.get("R"));
				map.replace("R",a);
			}
		}
		System.out.println(count);
	}
}