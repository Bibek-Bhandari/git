import java.util.Scanner;
public class RandomTeam{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int no_of_participant=0;int no_of_teams=0;
		no_of_participant=sc.nextInt();
		no_of_teams=sc.nextInt();

		long nmax=no_of_participant-no_of_teams+1;
		long n_min=no_of_participant/no_of_teams;
        long r_par=no_of_participant%no_of_teams;
        long min=((n_min*(n_min+1)/2)*r_par)+((n_min*(n_min-1)/2)*(no_of_teams-r_par));
        System.out.println(min);
		System.out.println(nmax*(nmax-1)/2);
	}
}