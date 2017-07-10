import java.util.Scanner;

public class Forces{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int no_of_inputs=sc.nextInt();
		int x=0,y=0,z=0;
		for(int i=0;i<no_of_inputs;i++){
             x+=sc.nextInt();
             y+=sc.nextInt();
             z+=sc.nextInt();
		}

		if(x==0&&y==0&&z==0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
 
	}
}