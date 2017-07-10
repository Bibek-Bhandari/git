import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Lecture{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		HashMap<String,String> hmap=new HashMap<>();
		int n,m;
		n=sc.nextInt();
		m=sc.nextInt();
		int i=0;
		String s1,s2;
		while(i!=m){
			s1=sc.next();
			s2=sc.next();
			if(s1.length()>s2.length()){
              hmap.put(s1,s2);
			}else{
			  hmap.put(s2,s1);
			}
			i++;
		}
        sc.nextLine();
		StringTokenizer st=new StringTokenizer(sc.nextLine()," ");
        ArrayList<String> arr=new ArrayList<>();
        String temp;
		while(st.hasMoreTokens()){
               temp=st.nextToken();
               if(hmap.containsKey(temp)){
                   arr.add(hmap.get(temp));
               }else{
               	   arr.add(temp);
               }
		}

		for(String x:arr){
			System.out.print(x+" ");
		}
	}
}