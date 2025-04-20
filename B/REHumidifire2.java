import java.util.*;

public class REHumidifire2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        int d=sc.nextInt();
        String[] s=new String[h];
        for(int i=0;i<h;i++){
            s[i]=sc.next();
        }
        int max=0;
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                for(int k=0;k<h;k++){
                    for(int l=0;l<w;l++){
                        if(!(i==k&&j==l) && s[i].charAt(j)=='.' && s[k].charAt(l)=='.'){
                            int[][] judge=new int[h][w];
                            int count=0;
                            for(int x=0;x<h;x++){
                                for(int y=0;y<w;y++){
                                    if(s[x].charAt(y)=='.' && Math.abs(x-i)+Math.abs(y-j)<=d && judge[x][y]!=1){
                                        count++;
                                        judge[x][y]=1;
                                    }

                                    if(s[x].charAt(y)=='.' && Math.abs(x-k)+Math.abs(y-l)<=d && judge[x][y]!=1){
                                        count++;
                                        judge[x][y]=1;
                                    }

                                }
                            }
                            max=Math.max(max,count);
                        }
                        
                    }
                }
            }
        }
        System.out.print(max);

    }
    
}
