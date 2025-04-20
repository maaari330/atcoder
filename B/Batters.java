import java.util.*;

public class Batters{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] mass=new int[4];
        int P=0;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            mass[0]+=1;
            for(int j=mass.length-1;j>=0;j--){
                if(mass[j]!=0){
                    mass[j]-=1;
                    if(j+a<mass.length){
                        mass[j+a]+=1;
                    }
                    else{
                        P+=1;
                    }
                } 
            }
        }
        System.out.print(P);
    }
}