import java.util.*;

public class LineSensor{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		String[] c=new String[h];
		for(int i=0;i<h;i++){
			c[i]=sc.next();
		}
		Map<Integer,Integer> map=new HashMap<>();
		for(int j=0;j<w;j++){
			map.put(j,0);
			for(int i=0;i<h;i++){
				if(c[i].charAt(j)=='#'){
					map.replace(j,map.get(j)+1);
				}
			}
			System.out.print(map.get(j)+" ");
		}
	}
}