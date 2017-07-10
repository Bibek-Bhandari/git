import java.util.Scanner;
import java.util.ArrayList;
public class Game{


	public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          int no_of_teams=sc.nextInt();
          ArrayList<Integer> homeC=new ArrayList<>();
          ArrayList<Integer> guestC=new ArrayList<>();
          
          for(int i=0;i<no_of_teams;i++){
                homeC.add(sc.nextInt());
                guestC.add(sc.nextInt());
          }
          int count=0;
          for(int x:homeC){
          	for(int y:guestC){
          		if(x==y){
          			count++;
          		}
          	}
          }

          System.out.println(count);
	}
}