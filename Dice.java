import java.util.*;

public class Dice{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		n1=sc.nextInt();
		n2=sc.nextInt();
        
        int win1,win2,draw;
        win1=win2=draw=0;
		for(int i=1;i<=6;i++){

            if(Math.abs(n1-i)<Math.abs(n2-i)){
            	win1++;
            }else if(Math.abs(n1-i)>Math.abs(n2-i)){
            	win2++;
            }else{
            	draw++;
            }
		}

		System.out.println(win1+" "+draw+" "+win2);
	}
}