import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.math.BigInteger;
public class SumAndLength{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		BigInteger sum=BigInteger.valueOf(sc.nextInt());
		
		BigInteger one=BigInteger.ONE;
        ArrayList<BigInteger> arr=new ArrayList<>();
        BigInteger i= BigInteger.valueOf((long)Math.pow(10,len-1));
    

		while(i.compareTo(BigInteger.valueOf((long)Math.pow(10,len)))!=0){
			 
              if(sum.compareTo(sum(i.toString()))==0){
                   arr.add(i); 
              }

              i=i.add(one);
              
		}

		if(arr.size()==0){
			System.out.println(-1+" "+(-1));
			return;
		}
        Collections.sort(arr);
		System.out.println(arr.get(0)+" "+arr.get(arr.size()-1));

	}

	public static BigInteger sum(String num){
		String digits = num.toString();
int sum = 0;

for(int i = 0; i < digits.length(); i++) {
    int digit = (int) (digits.charAt(i) - '0');
    sum = sum + digit;
}

		return BigInteger.valueOf( sum);
	}
}