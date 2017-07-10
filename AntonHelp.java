import java.util.Scanner;
import java.util.ArrayList;
import java.math.BigInteger;



public class AntonHelp{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        String numS=sc.next();
        int countless=-1,countmore=-1;
        for(int i=0;i<numS.length()-1;i++){
             if((numS.charAt(i))%2==0){
             	 if(numS.charAt(i)<numS.charAt(numS.length()-1)){
                   countless=i;
                   break;  
               }
                   countmore=i;
             }
        }   
     
        if(countless!=-1){
        	numS=(replaceChar(new String(numS),countless,numS.length()-1));
        }else if(countmore!=-1){
        	  numS=(replaceChar(new String(numS),countmore,numS.length()-1));
        }else{
  
        	System.out.println("-1");
             return;
            }
         System.out.println(numS);
       
	}


	public static String replaceChar(String temp,int i,int j){
		char[] x=temp.toCharArray();
		char t=x[i];
		x[i]=x[j];
		x[j]=t;
		 return new String(x);

	}


}