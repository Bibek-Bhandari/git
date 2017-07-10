
import java.util.Scanner;

public class Fun{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
        int fun,time,max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
             fun=sc.nextInt();
             time=sc.nextInt();

             if(time>k){
             	fun=fun+k-time;
             }

             if(max<fun){
             	max=fun;
             }
		}
		System.out.println(max);
	}
}