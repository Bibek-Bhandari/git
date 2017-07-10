
import java.util.*;

public class LaptopsArray{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] a=new int[size+1];
		Integer[] x=new Integer[7];

		for(int i=1;i<=size;i++){
			a[sc.nextInt()]=sc.nextInt();
		}
       
		for(int i=2;i<=size;i++){
             if(a[i-1]>a[i]){
             	System.out.println("Happy Alex");
             	return;
             }

		}
		System.out.println("Poor Alex");
	}

}