import java.util.*;

public class RectangleDetection{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String[] s=new String[10];
		for(int i=0;i<10;i++){
			s[i]=sc.next();
		}
		List<Integer> ab=new ArrayList<>();
		List<Integer> cd=new ArrayList<>();
		int a=0,b=11,c=0,d=11;
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				if(s[i].charAt(j)=='#'){
					ab.add(i+1);
					cd.add(j+1);
				}
			}
		}
		System.out.println(Collections.min(ab)+" "+Collections.max(ab));
		System.out.print(Collections.min(cd)+" "+Collections.max(cd));
	}
}