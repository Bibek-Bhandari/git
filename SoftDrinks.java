
import java.util.*;

public class SoftDrinks{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int ltrs=sc.nextInt()*sc.nextInt();
		int slice=sc.nextInt()*sc.nextInt();
		int p=sc.nextInt();

		System.out.println(min(ltrs/sc.nextInt(),slice,p/sc.nextInt())/n);

	}

	public static int  min(int l,int m,int n){
		return (int)Integer.min(l,Integer.min(m,n));
	}


}