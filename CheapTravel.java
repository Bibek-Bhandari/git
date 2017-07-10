import java.util.Scanner;

public class CheapTravel{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n,m,a,b,temp,qut;
		n=sc.nextInt();
		m=sc.nextInt();
		a=sc.nextInt();
		b=sc.nextInt();
        
        if(m*a<b){
        	System.out.println(n*a);
        	return;
        }
		temp=(n/m)*b;
        qut=(n%m)*a;
		if(qut>b){
			temp+=b;
		}else{
			temp+=qut;
		}

		System.out.println(temp);
	}
}