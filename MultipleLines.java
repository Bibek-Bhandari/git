
import java.util.Scanner;

public class MultipleLines {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input=sc.nextInt();
	        int i=0;
        String s="";
        while(i<2){
        	s+=sc.nextLine()+" ";
            i++; 
        }
       
		System.out.println(s);
	}
}
