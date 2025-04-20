import java.util.*;

public class AtCoderAmusementPark{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		ArrayList<Integer> a=new ArrayList<Integer>();
		int count=0,temp=0,i=0;
		for(int j=0;j<n;j++){
			a.add(sc.nextInt());
		}
		while(i<n){
			if(temp+a.get(i)<=k){
				temp+=a.get(i);
				if(i==n-1){
					count++;
				}
				i++;
			}
			else{
				count++;
				temp=0;
			}
		}
		System.out.println(count);
	}
}