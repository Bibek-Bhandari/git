import java.util.Scanner;


public class TeamOlympyad{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		String count1=new String();
		String count2=new String();
		String count3=new String();
        int cout1,cout2,cout3;
        cout1=cout2=cout3=0;
		int temp=0;
		for(int i=1;i<=input;i++){
            temp=sc.nextInt();
            if(temp==1){
            	count1+=" "+i;
            	cout1++;
            }else if(temp==2){
            	count2+=" "+i;
            	cout2++;
            }else{
            	count3+=" "+i;
            	cout3++;
            }
		}
	  
		int num=Integer.min(Integer.min(cout1,cout2),cout3);
        System.out.println(num);

       
		String[] arr1=count1.trim().split("\\s");
		String[] arr2=count2.trim().split("\\s");
		String[] arr3=count3.trim().split("\\s");
 		for(int i=0;i<num;i++){
			System.out.println(arr1[i]+" "+arr2[i]+" "+arr3[i]);
		}

	}
}