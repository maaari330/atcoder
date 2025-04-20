import java.util.*;

public class StrictlySuperior{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] p=new int[n];
		List<List<Integer>> f=new ArrayList<>();
		for(int i=0;i<n;i++){
			p[i]=sc.nextInt();
			int c=sc.nextInt();
			List<Integer> temp=new ArrayList<>();
			for(int j=0;j<c;j++){
				temp.add(sc.nextInt());
			}
			f.add(temp);
		}
		boolean found=false;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i!=j&&f.get(i).containsAll(f.get(j))){
					if(p[i]==p[j]&&f.get(i).size()>f.get(j).size()){
						found=true;
					}
					else if(p[i]<p[j]){
						found=true;
					}
				}
			}
		}
		if(found){
			System.out.print("Yes");
		}
		else{
			System.out.print("No");
		}
	}
}