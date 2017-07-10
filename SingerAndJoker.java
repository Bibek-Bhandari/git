import java.util.Scanner;

public class SingerAndJoker{


	public static void main(String[] args){
          Scanner sc=new Scanner(System.in);

          final int n=sc.nextInt();
          final int d=sc.nextInt();
           int du_n=0;
          for(int i=0;i<n;i++ ){
          	du_n+=sc.nextInt();
          }
          int temp=du_n;
          du_n+=(n-1)*10;
          if(du_n<=d){
            System.out.println((d-temp)/5);
          }else{
          	System.out.println(-1);
          }
	}
}