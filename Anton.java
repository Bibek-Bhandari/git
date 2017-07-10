import java.util.Scanner;
public class Anton{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int[] index=new int[26];
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>=97 &&  str.charAt(i)<=122){
                index[str.charAt(i)-97]++;
			}
		}
        int count=0;
		for(int i:index){
			if(i!=0){
				count++;
			}
		}
		System.out.println(count);
	}
}