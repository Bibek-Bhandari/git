import java.util.Scanner;

public class Simple{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
         int flag=0;
		if((n==0||m==0)||(n%2==0 && m%2==0)||(n%2==0 && n<=m)){
           flag=0;
		}
		else if(n%2!=0 && m<n && m%2==0){
			flag=0;
		}else{
			flag=1;
		}
		if(flag==1){
			System.out.println("Akshat");
		}else{
			System.out.println("Malvika");
		}
	}
}