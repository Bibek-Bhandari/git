import java.util.Scanner;

public class Dubstep{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String re="";
		String resp=s.replace("WUB","+");
		int flag=0;
		for(int i=0;i<resp.length();i++)
		{
            if(resp.charAt(i)=='+'){
            	if(flag==0){
            		re+=" ";
            	}
            	flag=1;
            }else{
            	re+=resp.charAt(i);
            	flag=0;
            }
            
		}
        System.out.println(re.trim());
         
	}
}