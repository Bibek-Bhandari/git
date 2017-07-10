import java.util.Scanner;
import java.util.Arrays;
public class ArraySorted{
   

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();

		int[] arr=new int[input];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
        int l,r;
        l=-1;
        r=arr.length-1;
		for(int i=0;i<arr.length-1;i++){
            if(l==-1 && arr[i]>arr[i+1]){
            	l=i;
            }
            if(l!=-1 && r==arr.length-1 && arr[i]<arr[i+1]){
            	r=i;
            }
		}

        if(l==-1){
        	l=1;r=1;
        }else{
            Arrays.sort(arr,l,r+1);
            l++;
            r++;
        }

		if(isSorted(arr)){
			System.out.println("yes");
			System.out.println(l+" "+r);
		}else{
			System.out.println("no");
		}
		
	}

	public static boolean isSorted(int[] arr){
		if(arr==null) return true;

		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1]) return false;
		}

		return true;
	}

}