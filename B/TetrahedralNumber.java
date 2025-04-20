import java.util.Scanner;

public class TetrahedralNumber{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n;i++){
			for(int j=0;j<=n;j++){
				for(int k=0;k<=n;k++){
					if(i+j+k<=n){
						System.out.println(i+" "+j+" "+k);
					}
				}
			}
		}
	}
}