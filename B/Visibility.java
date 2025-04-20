import java.util.*;

public class Visibility{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        String[] H=new String[h];
        for(int i=0;i<h;i++){
            H[i]=sc.next();
        }

        int count=1;
        for(int i=y;i<w;i++){
            if(H[x-1].charAt(i)=='.'){
                count++;
            }
            else{
                break;
            }
        }

        for(int i=y-2;i>=0;i--){
            if(H[x-1].charAt(i)=='.'){
                count++;
            }
            else{
                break;
            }
        }

        for(int i=x;i<h;i++){
            if(H[i].charAt(y-1)=='.'){
                count++;
            }
            else{
                break;
            }
        }

        for(int i=x-2;i>=0;i--){
            if(H[i].charAt(y-1)=='.'){
                count++;
            }
            else{
                break;
            }
        }
        System.out.print(count);
    }
}