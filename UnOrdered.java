import java.util.Scanner;

class UnOrdered{
    
    public static int unOrderedLinearSearch(int[] arr,int data){

    	for(int i=0;i<arr.length;i++){
    		if(arr[i]==data){
    			return 1;
    		}
    	}
    	return -1;
    }

    public void insert(int[] arr,int data){
    	if(arr.length==0)
    		System.out.println("the item not inserted:");
    	else{
    		
    	}
    }


	public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		int[] arr={2,5,4,3,1,6};
		System.out.println("Enter the data to be searched:");
        int data=sc.nextInt();
        
         if(unOrderedLinearSearch(arr,data)==1){
         	System.out.println("the item is present:");
         }else{
            System.out.println("the item is not present");
         }
	}
	
}
