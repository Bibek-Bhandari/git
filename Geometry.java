import java.util.Scanner;


public class Geometry{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		final int r=sc.nextInt();
		final int x=sc.nextInt();
		final int y=sc.nextInt();
		final int x1=sc.nextInt();
		final int y1=sc.nextInt();

		int diff=x1+y1-x-y;
		int dia=2*r;
		if(diff%dia==0){
			System.out.println(diff/dia);
		}else{
			System.out.println(diff%dia);
		}

	}
}