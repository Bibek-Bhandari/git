import java.util.Scanner;

public class Armspin{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int r,x1,y1,x2,y2;
		r=sc.nextInt();
		x1=sc.nextInt();
		y1=sc.nextInt();
		x2=sc.nextInt();
		y2=sc.nextInt();

		double d=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));

		System.out.println((int)Math.ceil(d/(r*2)));

	}
}