import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class ChoosingTeam{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
        
        ArrayList<Integer> arr=new ArrayList<>();
        int temp;
		for(int i=0;i<n;i++){
           temp=sc.nextInt();
           if(5-temp>=k){
           	arr.add(temp);
           }
		}

		System.out.print(arr.size()/3);
	}
}