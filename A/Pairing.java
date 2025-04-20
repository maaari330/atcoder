import java.util.Scanner;

public class Pairing{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int ball=0;
		int[] a=new int[4];
		int match1=5;
		int count=0;

		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
			if(!(a[i]>=0 && a[i]<=4)){
				break;
			}
		}
		
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j] && i!=match1){
					match1=j;
					count++;
					break;
				}
			}
		}
		
		System.out.println(count);
	}
}
