import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Taro{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		Map<Integer,String> map=new HashMap<>();
		
		for(int i=1;i<=n;i++){
			map.put(i,"kara");
		}
		
		for(int i=0;i<m;i++){
			int a=sc.nextInt();
			String b=sc.next();
			if(map.get(a).equals("kara") && b.equals("M")){
				System.out.println("Yes");
				map.replace(a,b);
			}
			else{
				System.out.println("No");
			}
			
		}
	}
}