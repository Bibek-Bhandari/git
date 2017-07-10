import java.util.*;

public class Coprime{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long a,flag=0,c;
		a=c=0;
		a=sc.nextLong();
		c=sc.nextLong();

		if(!iscoprime(a,c)){
			for(long i=a+1;i<c;i++){
				if(iscoprime(a,i)&&iscoprime(i,c)){
					System.out.println(a+" "+i+" "+c);
					flag=1;
					break;
				}
			}
		}

		if(flag==0){
			System.out.println(-1);
		}
	}

	public static boolean iscoprime(long a,long b){
		long min=Long.min(a,b);
		if(a%2==0 && b%2==0)
			return false;

		for(long i=3;i<=(long)Math.sqrt(min);i+=2){
			if(a%i==0 && b%i==0)
				return false;
		}
		return true;
	}
}