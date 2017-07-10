import java.util.Scanner;

public class ValueAtPos{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		long n=sc.nextLong();
		long k=sc.nextLong();
		long border=0,num=0;

		if(n%2==0) border=n/2;
		else{
			border=n/2+1;
		}

		if(k<=border){
			num=2*k-1;
		}else{
			k-=border;
			num=2*k;
		}

		if(num<=n)
			System.out.println(num);

	}
}