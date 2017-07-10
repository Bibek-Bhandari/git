import java.util.Scanner;

public class GameWithStick{


	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
        int[][] arr=new int[n][m];
        int value=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				arr[i][j]=++value;
			}
		}
        int action=0;//mavika
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(arr[i][j]!=0){
					if(action==0){
						action=1;
					}else{
						action=0;
					}
                    int temp=0;
					while(temp!=m){
						arr[i][temp]=0;
						temp++;
					}
					temp=0;
					while(temp!=n){
						arr[temp][j]=0;
						temp++;
					}
					break;
				}
			}
		}
		if(action==1){
			System.out.println("Akshat");
		}else{
			System.out.println("Malvika");
		}
	}
}