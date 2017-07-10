import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class LoveString{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		int k=sc.nextInt();

        ArrayList<Integer> arr=new ArrayList<>();
		for(int i=0;i<26;i++){
           arr.add(sc.nextInt());
		}
		int num=st.length()+1;
		int max=Collections.max(arr);
		int total=0;

		for(int i=num;i<num+k;i++){
             total+=i*max;
		}

		for(int i=1;i<num;i++){
			total+=arr.get(st.charAt(i-1)-'a')*i;
		}

		System.out.println(total);
	}
}