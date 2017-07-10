import java.util.Scanner;
import java.util.Arrays;
public class Puzzels{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int no_of_students=sc.nextInt();
		int no_of_puzzels=sc.nextInt();
        int[] arr=new int[no_of_puzzels];
		for(int i=0;i<no_of_puzzels;i++){
			arr[i]=sc.nextInt();
		}
		Arrays.parallelSort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=no_of_puzzels-1;i>=no_of_students-1;i--)
        {
		     if(min>(arr[i]-arr[i-no_of_students+1])){
			    min=arr[i]-arr[i-no_of_students+1];
		     }
	    }
	    System.out.println(min);

	}
}