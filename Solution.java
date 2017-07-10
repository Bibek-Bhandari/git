import java.util.Scanner;

public class Solution{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(getFirstTwoNumbersOfString(s))
	}

    public static String getFirstTwoNumbersOfString(String s){
    	if(S==null||s.length<2)return "";
    	 String numbers = "0123456789";

    	 return numbers.charAt(0)+numbers.charAt(1);
    }


} 