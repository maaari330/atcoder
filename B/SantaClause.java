import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class SantaClause{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt(),w=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt();
		
		x=x-1;
		y=y-1;
		
		String line="";
		Queue<String> queue=new LinkedList<>();
		String[][] array=new String[h][w];
		
		for(int i=0;i<h;i++){
			line=line+sc.next();
		}
		
		for(int i=0;i<line.length();i++){
			queue.add(String.valueOf(line.charAt(i)));
		}
			
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				array[i][j]=queue.poll();
			}
		}
		
		String t=sc.next();
		int count=0;
		String[][] record=new String[100][100];
		
		for(int i=0;i<t.length();i++){
			if(t.charAt(i)=='U' && !(array[x-1][y].equals("#"))){
				x=x-1;
			}
			else if(t.charAt(i)=='D' && !(array[x+1][y].equals("#"))){
				x=x+1;
			}
			else if(t.charAt(i)=='L' && !(array[x][y-1].equals("#"))){
				y=y-1;
				//System.out.println("array["+x+"]"+"["+y+"]="+array[x][y]);
			}
			else if(t.charAt(i)=='R' && !(array[x][y+1].equals("#"))){
				y=y+1;
			}
			else{
			}
			
			if(array[x][y].equals("@") && record[x][y]==null){
				count++;
				record[x][y]="@";
				//System.out.println("array["+x+"]"+"["+y+"]="+array[x][y]);
			}
		}
		
		System.out.println((x+1)+" "+(y+1)+" "+count);
	}
	
	
	
}