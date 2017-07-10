import java.util.*;

public class Workout{


	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
        int chest=0,biceps=0,back=0;
        int[] arr=new int[input];
		for(int i=0;i<input;i++){
            if(i%3==0){
            	chest+=sc.nextInt();
            }else if(i%3==1){
            	biceps+=sc.nextInt();
            }else{
            	back+=sc.nextInt();
            }
		}

		int max=Integer.max(chest,Integer.max(biceps,back));
		if(max==chest){
			System.out.println("chest");
		}else if(max==biceps){
			System.out.println("biceps");
		}else {
			System.out.println("back");
		}


	}
}