import java.util.Scanner;

public class Length{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int s=sc.nextInt();
         
		System.out.println(findmin(m,s));
		System.out.println(findmax(m,s));

	}

	public static int[] findmin(int m,int s){
		int[] arr=new int[m];
		if(s==0){
			if(m==1)return 0;
			return -1;
		}
		s-=1;

		for(int i=m-1;i>0;i++){
			if(s>9){
				arr[i]=9;
				s-=9;
			}else{
				arr[i]=s;
				s=0;
			}
		}

		arr[0]=s+1;

		return arr;
	}

	public static int[] findmax(int m,int n){
		
	}
}