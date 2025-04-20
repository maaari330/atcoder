import java.util.*;
import java.io.*;
import java.math.*;

public class REBase2{
    public static void main(String[] args){
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        try{
            String s=reader.readLine();
            s=s.replaceAll(" ","");
            BigInteger result=BigInteger.ZERO;
            BigInteger two=new BigInteger("2");

            for(int i=0;i<s.length();i++){
                String temp=String.valueOf(s.charAt(i));
                if(temp.equals("1")){
                    BigInteger calc=two.pow(i);
                    result=result.add(calc);
                }
            }
            System.out.print(result);
        }
        catch(IOException e){
        }
    }
}