import java.util.Scanner;
import java.util.ArrayList;


public class Strawberry{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
        sc.nextLine();
		if((r<=2||c<=2)&&(r>10||c>10)){
             return;
		}
        ArrayList<Integer> row=new ArrayList<>();
        ArrayList<Integer> col=new ArrayList<>();
        String s=new String();
		for(int i=0;i<r;i++){
            s=sc.nextLine();
			for(int j=0;j<c;j++){
                 if(s.charAt(j)=='S'){
                 	 row.add(i);
                     col.add(j);
                 }
			}
		}

		int count=0;

		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
                 if(row.contains(i) && col.contains(j)){
                     continue;
                 }else{
                 	count++;
                 }
			}
		}
		System.out.println(count);

	}
}