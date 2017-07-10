import java.io.BufferedReader ;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Solution{
 
    public static void main(String[] args) throws IOException{
 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=new String(br.readLine());
        //remove 
        String[] arrS=s.split("\\+");
        Integer[] arrI=new Integer[arrS.length];
        int i=0;
        for(String sn:arrS){
            arrI[i]=Integer.parseInt(sn);
            i++;
        }

        Arrays.sort(arrI);
        i=-1;//for whose length is one 
        for(int j=0;j<arrI.length-1;j++){
            i=j;
            System.out.print(arrI[j]+"+");
        }
        System.out.print(arrI[++i]);

    }
 
}