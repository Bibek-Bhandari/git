import java.util.Scanner;

public class Tprime{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		long[] arr=new long[input];

		for(int i=0;i<input;i++){
			arr[i]=sc.nextLong();
		}

        long temp,j=2;
		int i=0,count;
		while(i!=arr.length){
			temp=arr[i];
		    j=2;
		    count=0;
		    System.out.println(temp/2);
			for(j=2;j<=temp/2;j++){
				if(temp%j==0)count++;
			}
			if(count==1)System.out.println("YES");
			else
				System.out.println("NO");
			i++;
		}
	}
}