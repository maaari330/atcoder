import java.util.Scanner;

public class Couples{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),count=0;
		int[] a=new int[n*2];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n*2-1;i++){
			for(int j=i+1;j<n*2;j++){
				if(a[i]==a[j]){
					if(j-i==2){
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}