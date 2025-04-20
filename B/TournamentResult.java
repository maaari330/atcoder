import java.util.*;

public class TournamentResult{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] A=new String[n];
        for(int i=0;i<n;i++){
            A[i]=sc.next();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(A[i].charAt(j)=='D'&&A[j].charAt(i)!='D'){
                    System.out.print("incorrect");
                    return;
                }
                if(A[i].charAt(j)=='W'&&A[j].charAt(i)!='L'){
                    System.out.print("incorrect");
                    return;
                }
                if(A[i].charAt(j)=='L'&&A[j].charAt(i)!='W'){
                    System.out.print("incorrect");
                    return;
                }
            }
        }
        System.out.print("correct");
    }
}