import java.util.Scanner;

public class IllyaAndBankAccount{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int x,y;

		if(n<0){
			
                x=n%10;
                n=n/10;
                y=n%10;
                n=n/10;
                n*=10;
                n+=x<y?y:x;
                System.out.println(n);
	
		}else {
                System.out.println(n);
		}
		
	}
}