import java.util.Scanner;
public class Outbid{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int v=sc.nextInt();

		int[][] arr=new int[n][];
        
        int temp,count=0;
        StringBuffer s=new StringBuffer();
		for(int i=1;i<=n;i++){
			temp=sc.nextInt();
			for(int j=1;j<=temp;j++){
				if(v>sc.nextInt()){
                   s.append(i+" ");
                   count++;
                   break;
				}
			}
			sc.nextLine();
		}

		System.out.println(count);

		System.out.println(s);
	}
}