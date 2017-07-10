
import java.util.Scanner;

public class Iq{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		StringBuilder odd=new StringBuilder();
		StringBuilder even=new StringBuilder();
		for(int i=1;i<=n;i++){
			int temp=sc.nextInt();
			if(temp%2==0){
				even.append(i+" ");
			}else{
				odd.append(i+" ");
			}
		}

		if(even.toString().split(" ").length==1){
			System.out.println(even);
		}else{
            System.out.println(odd);
		}
	} 
}