import java.util.Scanner;

public class Decrease2MaxElements{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),count=0,endcount=0;
		int[] a=new int[n];
		boolean result=true;
		
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		while(result==true){
			for(int i=0;i<n-1;i++){
				for(int j=i+1;j<n;j++){
					if(a[i]<a[j]){
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			a[0]=a[0]-1;
			a[1]=a[1]-1;
			endcount++;

			for(int i=0;i<n;i++){
				if(a[i]>0){
					count++;
				}
			}
			
			if(count<=1){
				result=false;
			}
			else{
				count=0;
			}
		}
		System.out.println(endcount);
	}
}