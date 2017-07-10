import java.util.Scanner;


class OrderedSearch{

	public static int OrderedSearch(int[] arr,int data){

		for(int i=0;i<arr.length;i++){
			if(arr[i]==data){
				return 1;
			}
			else if(arr[i]>data){
				return -1;
			}
		}
		return -1;
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the data:");
		int arr[]={0,1,2,3,4};
		int data=sc.nextInt();

		if(OrderedSearch(arr,data)==1){
			System.out.println("the data is present:");
		}
		else{
			System.out.println("the data is not present");
		}
	}
}


























































