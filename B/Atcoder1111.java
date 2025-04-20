import java.util.*;

public class Atcoder1111{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> zorome=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			list.add(sc.nextInt());
		}
		int count=0;
		for(int i=0;i<n;i++){
			int zoro=i+1;
			if(zoro/10==0||(zoro/10>0&&zoro/10==zoro%10)){
				if(zoro/10>0&&zoro/10==zoro%10){
					zoro=zoro%10;
				}
				for(int j=1;j<=list.get(i);j++){
					int ten1=j%10,k=0,ten2=0,ten3=0;
					if(j/10!=0){
						k=j/10;
					}
					if(k>=10){
						ten2=k%10;
						ten3=k/10;
					}
					else{
						ten2=k;
					}
					
					if(ten1==zoro&&ten2==0&&ten3==0 ||(ten1==zoro && (ten2==zoro&&ten3==0 || ten2==zoro&&ten3==zoro))){
						count++;
					}
				}
			}
		}
		System.out.print(count);
	}
}