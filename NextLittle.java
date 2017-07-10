import java.util.Scanner;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class NextLittle{


	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int level=sc.nextInt();
		HashSet<Integer> hs=new LinkedHashSet<>();
		for(int i=0;i<2;i++){
			int x=sc.nextInt();
			for(int j=0;j<x;j++){
				hs.add(sc.nextInt());
			}
		}

		if(hs.size()==level){
			System.out.println("I become the guy.");
		}else{
			System.out.println("Oh, my keyboard!");
		}
	}
}