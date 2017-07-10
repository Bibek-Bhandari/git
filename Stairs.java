import java.util.Scanner;


public class Stairs{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
        int min=0;
		if(n%2==0){
            min=getMinSteps(n/2,m,n);
            
		}else{
			min=getMinSteps(n/2+1,m,n);
		}

		System.out.println(min);
	}

	public static int getMinSteps(int min,int m,int n){
		for(int i=min;i<=n;i++){
            	if(i%m==0){
            		return i;
            	}
         }

         return -1;
	}
}
