import java.util.*;

public class Splitt{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(s.charAt(0)=='1'){
			System.out.print("No");
			return;
		}
		String[] str=new String[7];
		boolean[] strike=new boolean[7];
		str[0]=String.valueOf(s.charAt(6));
		str[1]=String.valueOf(s.charAt(3));
		str[2]=String.valueOf(s.charAt(1))+String.valueOf(s.charAt(7));
		str[3]=String.valueOf(s.charAt(0))+String.valueOf(s.charAt(4));
		str[4]=String.valueOf(s.charAt(2))+String.valueOf(s.charAt(8));
		str[5]=String.valueOf(s.charAt(5));
		str[6]=String.valueOf(s.charAt(9));
		for(int i=0;i<str.length;i++){
			if(str[i].contains("1")){
				strike[i]=false;
			}
			else{
				strike[i]=true;
			}
		}
		int result1=0,result2=0;
		for(int i=0;i<strike.length;i++){
			if(strike[i]){
				for(int j=0;j<i;j++){
					if(!strike[j]){
						result1=1;
					}
				}
				for(int j=i+1;j<strike.length;j++){
					if(!strike[j]){
						result2=1;
					}
				}
				if(result1==1&&result2==1){
					System.out.print("Yes");
					return;
				}
				else{
					result1=0;
					result2=0;
				}
			}
		}
		System.out.print("No");
	}
}