
import java.util.Scanner;

public class TprimeJava{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        long temp=0;
		for(int i=0;i<n;i++){
            temp=sc.nextLong();

            if(istrival(temp)){
            	System.out.println("YES");
            }else{
            	System.out.println("NO");
            }
		}
	}

	public static boolean istrival(long num){

		if(num%2==0)
			return false;
        
        for(int i=3;i<(int)Math.sqrt(num);i+=2){
             if(num%i==0)return false;
        }

        return true;
	}
}