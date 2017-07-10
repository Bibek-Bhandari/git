import java.util.Scanner;
import java.util.Arrays;
public class BeautifulMatrix{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int no_lanterns=sc.nextInt();
		int length=sc.nextInt();

		int[] arr=new int[no_lanterns];
        double max=Double.MIN_VALUE;
     
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();  
		}
        Arrays.sort(arr);
        
        for(int i=1;i<arr.length;i++){
			if(Math.abs(arr[i-1]-arr[i])>max){
            	max=Math.abs(arr[i-1]-arr[i]);
            }
		}
		
		if(arr[0]!=0 && arr[no_lanterns-1]!=length){
			max=Double.max(length-arr[no_lanterns-1],Double.max(max/2,arr[0]));
		}
		else if(arr[0]!=0){
            max=Double.max(max/2,arr[0]);
		}
		else if(arr[arr.length-1]!=length){
            max=Double.max(max/2f,length-arr[arr.length-1]);
		}else{
			max=max/2;
		}
		System.out.printf("%f",max);
	}
}

