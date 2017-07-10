import java.util.Scanner;
import java.util.ArrayList;

public class Solders{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		int no_of_inputs=sc.nextInt();

		ArrayList<Integer> arr=new ArrayList<>();

		for(int i=0;i<no_of_inputs;i++){
			arr.add(sc.nextInt());
		}
		int min=arr.get(0);
		int max=arr.get(0);

		for(Integer i:arr){

			if(i<min) min=i;
			if(i>max) max=i;
 		}

 		int total=0;
 		if(arr.lastIndexOf(min)<arr.indexOf(max)){
        	total-=1;
        }
 		if(max!=arr.get(0)){
 			total+=arr.indexOf(max);
 		}
 		
 	    if(min!=arr.get(no_of_inputs-1)){
 			total+=arr.size()-arr.lastIndexOf(min)-1;
 		}

        System.out.println(total);
	}
}