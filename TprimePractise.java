import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TprimePractise{

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line=br.readLine();
		int input=Integer.valueOf(line);
        line=br.readLine();
        long sqrt,x;
        for(String num:line.split("\\s")){
            x=Long.valueOf(num);
    
        	if(x==1){
        		System.out.println("NO");
        		continue;
        	}
        	sqrt=(long)Math.sqrt(x);
        	if(sqrt*sqrt==x && isPrime(sqrt)){
        		System.out.println("YES");
        	}else{
        		System.out.println("NO");
        	}

        }
	}

	public static boolean isPrime(long n) {
    for(long i=2;2*i<n;i++) {
        if(n%i==0)
            return false;
    }
    return true;
}
}