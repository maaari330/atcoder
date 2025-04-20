import java.util.*;

public class UniqueNicknames{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] S=new String[n];
        String[] T=new String[n];
        for(int i=0;i<n;i++){
            S[i]=sc.next();
            T[i]=sc.next();
        }
        
        int[] s=new int[n];
        int[] t=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    if(S[i].equals(S[j])||S[i].equals(T[j])){
                        s[i]=1;
                    }

                    if(T[i].equals(S[j])||T[i].equals(T[j])){
                        t[i]=1;
                    }

                    if(s[i]==1&&t[i]==1){
                        System.out.print("No");
                        return;
                    }
                }
            }
        }
        System.out.print("Yes");
    }
}